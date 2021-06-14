package org.corso.costruttori;

public class Impiegato extends Persona {

    private String tipoLavoro;

    public Impiegato(String codiceFiscale, String tipoLavoro) {
        super(codiceFiscale);
        this.tipoLavoro = tipoLavoro;
    }

    public Impiegato(String nome, String codiceFiscale, String tipoLavoro) {
        this(codiceFiscale, tipoLavoro);
        this.tipoLavoro = tipoLavoro;
    }

    public String getTipoLavoro() {
        return tipoLavoro;
    }

}
