package org.corso.generics.magazzino.magazzinoE;

import org.corso.generics.magazzino.Prodotto;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        Magazzino<Prodotto, BigDecimal> magazzino = new Magazzino<>();
        final Prodotto pAA = new Prodotto("AA", "Descrizione AA");
        final Prodotto pBB = new Prodotto("BB", "Descrizione BB");

        magazzino.carico(pAA, new BigDecimal("5.00"));
        magazzino.carico(pBB, new BigDecimal("6.00"));
        magazzino.scarico(pAA, new BigDecimal("9.00"));

        /**
         * Ci serve una funzione lambda (la parte dx di questa uguaglianza
         * per incapsularla in un "predicato" (Predicate) di java per poter eseguire a
         * runtime il filtro che ci consente di estrarre il prodotto che risponde
         * a questa condizione p.equals(pAA)
         */
        Predicate<Prodotto> predicato = p->p.equals(pAA);

        /**
         * Ci serve una lambda per operare una somma ed ottenere il totale di tutte
         * le occorrenze movimentate di tipo pAA.
         */
        SommaFunc<BigDecimal> somma = (x, y) -> x.add(y);

        /**
         * eseguiamo il metodo esistenza passando come parametro la lambda incapsulata
         * nell´interfaccia funzionale di tipo Predicate.
         * Quel predicato verrá eseguito su ogni transazione di magazzino.
         */
        List<TransazioneMagazzino<Prodotto, BigDecimal>> transazioni = magazzino.esistenza(predicato);
        for(TransazioneMagazzino<Prodotto, BigDecimal> item: transazioni) {
            System.out.printf("P->%s, Q:%f\n", item.getSoggetto(), item.getQuantita());
        }

        System.out.printf("\nQuantitá totale del prodotto %s, %f", pAA.getDescrizione(), magazzino.esistenza(predicato, somma));
    }
}
