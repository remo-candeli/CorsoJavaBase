package org.corso.generics.magazzino.magazzinoD;

import org.corso.generics.magazzino.Persona;
import org.corso.generics.magazzino.Prodotto;


public class App {

    public static void main(String[] args) {
        magazzinoProdotti();
        invitiPersone();
    }

    private static void magazzinoProdotti() {
        Magazzino<Prodotto> magazzino = new Magazzino<>();
        final Prodotto pAA = new Prodotto("AA", "Descrizione AA");
        final Prodotto pBB = new Prodotto("BB", "Descrizione BB");

        magazzino.carico(pAA, 5);
        magazzino.carico(pBB, 6);
        magazzino.carico(pAA, 9);
        magazzino.scarico(pAA, 7);

        for(TransazioneMagazzino<Prodotto, Integer> item: magazzino.movimenti()) {
            System.out.println("Prodotto: " + item.getProdotto() + ", qtá: " + item.getQuantita() + " " + item.getMovimento());
        }
    }


    private static void invitiPersone() {
        Magazzino<String> magazzinoDiStringhe = new Magazzino<>();

        Magazzino<Persona> festa = new Magazzino<>();
        final Persona einstein = new Persona("Albert", "Einstein", "ABRMCCD..");
        final Persona bohr = new Persona("Niels", "Bohr", "NLSBHR..");
        final Persona curie = new Persona("Marie", "Curie", "CRMRI..");

        festa.carico(einstein, 5);
        festa.carico(bohr, 6);
        festa.carico(curie, 9);
        festa.scarico(einstein, 4);

        for(TransazioneMagazzino<Persona, Integer> item: festa.movimenti()) {
            System.out.println("Persona: " + item.getProdotto() + ", qtá: " + item.getQuantita() + " " + ((TipoMovimento.CARICO.equals(item.getMovimento()))?"Entrato":"Uscito"));
        }
    }
}
