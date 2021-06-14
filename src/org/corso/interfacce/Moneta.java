package org.corso.interfacce;

public class Moneta implements Playable {

    private Faces face;

    public String verify() {
        return "Risultato: " + face;
    }

    public void execute() {
        System.out.println("Esegue il lancio di " + getClass().getSimpleName());
        face = Faces.HEADS;
    }

    public void calcola() {

    }

}
