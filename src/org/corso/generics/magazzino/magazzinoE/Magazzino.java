package org.corso.generics.magazzino.magazzinoE;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Questa classe prevede che le quantitá movimentate possano essere anch´esse generiche.
 * Il problema di questa implementazione é che il calcolo dell'esistenza di un soggetto a magazzino
 * non funziona poiché non viene valutato il tipo di movimento di magazzino.
 * Il totale delle quantitá, dunque, é errato.
 *
 * @param <T> - é un placeholder (tipo parametrico) per individuare il tipo di elemento gestito dal magazzino
 * @param <Q> - é un plachehiolder (tipo parametrico) per individuare il tipo associato alla quantitá
 */
public class Magazzino<T, Q> {

    private List<TransazioneMagazzino<T, Q>> transazioni;

    public Magazzino() {
        transazioni = new ArrayList<>();
    }

    public void carico(T prodotto, Q quantita) {
        TransazioneMagazzino<T, Q> movimento = new TransazioneMagazzino<>(prodotto, quantita, TipoMovimento.CARICO);
        transazioni.add(movimento);
    }

    public void scarico(T prodotto, Q quantita) {
        TransazioneMagazzino<T, Q> movimento = new TransazioneMagazzino<T, Q>(prodotto, quantita, TipoMovimento.SCARICO);
        transazioni.add(movimento);
    }

    public List<TransazioneMagazzino<T, Q>> movimenti() {
        return transazioni;
    }

    /**
     * riceve il predicato (la condizione di filtro) da applicare ad ogni transazione
     * per filtrare solo le transazioni che rispettano la condizione del predicato.
     *
     * @param predicate
     * @return
     */
    public List<TransazioneMagazzino<T, Q>> esistenza(Predicate<T> predicate) {
        List<TransazioneMagazzino<T, Q>> result = new ArrayList<>();
        for(TransazioneMagazzino<T, Q> item: transazioni) {
            if (predicate.test(item.getSoggetto())) {
                result.add(item);
            }
        }
        return result;
    }


    /**
     * riceve il predicato (la condizione di filtro) da applicare ad ogni transazione
     * per filtrare solo le transazioni che rispettano la condizione del predicato.
     * Applica il predicato.
     * Applica la lambda somma per accumulare la quantitá esistente a magazzino.
     *
     * @param predicate
     * @return torna il totale della quantitá presente nel magazzino per un soggetto.
     */
    public Q esistenza(Predicate<T> predicate, SommaFunc<Q> somma) {
        Q result = null;
        for(TransazioneMagazzino<T, Q> item: transazioni) {
            if (predicate.test(item.getSoggetto())) {
                if (result==null) {
                    result = item.getQuantita();
                } else {
                    result = somma.sum(result, item.getQuantita());
                }
            }
        }
        return result;
    }
}
