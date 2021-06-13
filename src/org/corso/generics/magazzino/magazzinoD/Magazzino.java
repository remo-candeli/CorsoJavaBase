package org.corso.generics.magazzino.magazzinoD;


import java.util.ArrayList;
import java.util.List;

/**
 * Adesso si comincia a ragionare.
 * E' stato introdotto il concetto di "Transazione" ed incapsulato in una classe denominata "TransazioneMagazzino".
 * A questo punto si, é possibile includere in quella classe anche la quantitá perché una transazione di magazzino
 * prevede certamente una prodotto ed un movimento di quantitá oltre che un tipo di movimento di magzzino.
 * Ed é proprio quello che é stato incluso della classe in questione.
 * A questo punto l'implementazione dei metodi diventa molto lineare.
 *
 * @param <T> - é un placeholder (tipo parametrico) per individuare il tipo di elemento gestito dal magazino
 */
public class Magazzino<T> {

    // Il magazzino usa una lista di transazioni di tipo TransazioneMagazzino
    private List<TransazioneMagazzino<T, Integer>> transazioni;

    public Magazzino() {
        this.transazioni = new ArrayList<>();
    }

    /**
     * carico funziona su ogni tipo di argomento (soggetto) perché T puó essere di qualunque tipo
     *
     * @param soggetto
     * @param quantita
     */
    public void carico(T soggetto, int quantita) {
        TransazioneMagazzino<T, Integer> movimento = new TransazioneMagazzino<>(soggetto, quantita, TipoMovimento.CARICO);
        transazioni.add(movimento);
    }

    /**
     * scarico funziona su ogni tipo di argomento (soggetto) perché T puó essere di qualunque tipo
     *
     * @param soggetto
     * @param quantita
     */
    public void scarico(T soggetto, int quantita) {
        TransazioneMagazzino<T, Integer> movimento = new TransazioneMagazzino<>(soggetto, quantita, TipoMovimento.SCARICO);
        transazioni.add(movimento);
    }

    /**
     * restituisce l'elenco delle transazioni.
     *
     * @return
     */
    public List<TransazioneMagazzino<T, Integer>> movimenti() {
        return transazioni;
    }

}
