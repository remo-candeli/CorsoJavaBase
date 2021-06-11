package org.corso.generics.magazzino.magazzinoD;

/**
 * Una transazione a magazzino é costituita sempre da un oggetto della transazione (T prodotto)
 * e da una quantitá (A), e da un Tipo di Movimento (Carico, o Scarico).
 * @param <T>
 * @param <A>
 */
public class TransazioneMagazzino<T, A> {

    private T prodotto;
    private A quantita;
    private TipoMovimento movimento;

    public TransazioneMagazzino(T prodotto, A quantita, TipoMovimento movimento) {
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.movimento = movimento;
    }

    public T getProdotto() {
        return prodotto;
    }

    public void setProdotto(T prodotto) {
        this.prodotto = prodotto;
    }

    public A getQuantita() {
        return quantita;
    }

    public void setQuantita(A quantita) {
        this.quantita = quantita;
    }

    public TipoMovimento getMovimento() {
        return movimento;
    }
}
