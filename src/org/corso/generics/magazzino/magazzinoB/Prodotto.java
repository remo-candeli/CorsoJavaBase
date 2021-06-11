package org.corso.generics.magazzino.magazzinoB;

public class Prodotto {
    private String id;
    private String descrizione;
    private int quantita;

    public Prodotto() {
    }

    public Prodotto(String id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public int getQuantita() {
        return quantita;
    }
}
