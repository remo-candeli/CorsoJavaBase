package org.corso.costruttori;

public class Persona extends Object{
    private String nome;
    private String codiceFiscale;
    private String coloreCapelli;

    public Persona(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Persona(String nome, String codiceFiscale) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getColoreCapelli() {
        return coloreCapelli;
    }

    public void setColoreCapelli(String coloreCapelli) {
        this.coloreCapelli = coloreCapelli;
    }
}
