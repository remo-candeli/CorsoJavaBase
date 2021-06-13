package org.corso.collections.treesets;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Persona() {}

    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codiceFiscale, persona.codiceFiscale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    /**
     * Il compareTo deve sempre tornare un intero che é:
     * -1 se l'oggetto this é inferiore all'oggetto indicato come parametro di entrata
     *  0 se l'oggetto this é uguale all'oggetto indicato come parametro di entrata
     *  1 se l'oggetto this é maggiore all'oggetto indicato come parametro di entrata
     *
     * @param persona
     * @return
     */
    @Override
    public int compareTo(Persona persona) {
        cognome = (cognome==null)?"":cognome;
        nome = (nome==null)?"":nome;
        String personaCognome = (persona.getCognome()==null)?"":persona.getCognome();
        String personaNome = (persona.getNome()==null)?"":persona.getNome();
        String nomeCompletoThis = this.cognome.concat(this.nome);
        String nomeCompletoPersonain = personaCognome.concat(personaNome);
        return nomeCompletoThis.compareToIgnoreCase(nomeCompletoPersonain);
    }
}
