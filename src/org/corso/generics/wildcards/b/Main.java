package org.corso.generics.wildcards.b;

import org.corso.generics.wildcards.a.Impiegato;
import org.corso.generics.wildcards.a.Persona;


import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Persona> persone = new ArrayList<>();
    private static List<Impiegato> impiegati = new ArrayList<>();

    public static void main(String[] args) {

        final Persona einstein = new Persona("Albert", "Einstein", "ABRMCCD..");
        final Persona bohr = new Persona("Niels", "Bohr", "NLSBHR..");
        final Persona curie = new Persona("Marie", "Curie", "CRMRI..");
        final Persona davinci = new Persona("Leonardo", "Da Vinci", "LNRDV..");
        final Impiegato einsteinI = new Impiegato("Albert", "Einstein", "ABRMCCD..", "Contabile");
        final Impiegato bohrI = new Impiegato("Niels", "Bohr", "NLSBHR..", "Agente");
        final Impiegato curieI = new Impiegato("Marie", "Curie", "CRMRI..", "Supervisore");
        final Impiegato davinciI = new Impiegato("Leonardo", "Da Vinci", "LNRDV..", "Ingegnere");


        FiltroSoggetti<Persona> filtra = new FiltroSoggetti<>();
        aggiungiSoggettoPersona(filtra.accetta(einstein));
        aggiungiSoggettoPersona(filtra.accetta(bohr));
        aggiungiSoggettoPersona(filtra.accetta(curie));
        aggiungiSoggettoPersona(filtra.accetta(davinci));

        System.out.println("Stampa Persone:");
        for(Persona p: persone) {
            System.out.println(p.getCognome() + " " + p.getNome());
        }

        FiltroSoggetti<Impiegato> filtraI = new FiltroSoggetti<>();
        aggiungiSoggettoImpiegato(filtraI.accetta(einsteinI));
        aggiungiSoggettoImpiegato(filtraI.accetta(bohrI));
        aggiungiSoggettoImpiegato(filtraI.accetta(curieI));
        aggiungiSoggettoImpiegato(filtraI.accetta(davinciI));


        System.out.println("Stampa Impiegati:");
        for(Impiegato p: impiegati) {
            System.out.println(p.getCognome() + " " + p.getNome());
        }
    }

    private static void aggiungiSoggettoPersona(Persona soggetto) {
        if (soggetto!=null)
            persone.add(soggetto);
    }


    private static void aggiungiSoggettoImpiegato(Impiegato soggetto) {
        if (soggetto!=null)
            impiegati.add(soggetto);
    }


}
