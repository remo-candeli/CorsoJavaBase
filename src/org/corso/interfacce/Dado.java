package org.corso.interfacce;

public class Dado implements Playable{

    private int number;

    public String verify() {
        return "Risultato: "+number;
    }

    public void execute() {
        System.out.println("Esegue il lancio di " + getClass().getSimpleName());
        number = 3;
    }

    public void calcola() {

    }
}
