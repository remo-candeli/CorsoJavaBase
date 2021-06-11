package org.corso.generics.magazzino.magazzinoE;


public class TransazioneMagazzino<T, Q> {

    private T soggetto;
    private Q quantita;
    private TipoMovimento movimento;

    public TransazioneMagazzino(T soggetto, Q quantita, TipoMovimento movimento) {
        this.soggetto = soggetto;
        this.quantita = quantita;
        this.movimento = movimento;
    }

    public T getSoggetto() {
        return soggetto;
    }

    public void setSoggetto(T soggetto) {
        this.soggetto = soggetto;
    }

    public Q getQuantita() {
        return quantita;
    }

    public void setQuantita(Q quantita) {
        this.quantita = quantita;
    }

    public TipoMovimento getMovimento() {
        return movimento;
    }
}
