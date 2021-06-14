package org.corso.collections.treesets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // TreeSet é in grado di ordinare gli elementi in un set.
        // lo puó fare per tutti gli oggetti standard di java (come anche le stringhe)
        // é in grado di farlo anche per oggetti custom, ma occorre l'intervento del programmatore.
        Set<String> nomi = new TreeSet<>();
        nomi.add("Remo");
        nomi.add("Gino");
        nomi.add("Marco");
        nomi.add("Franco");
        nomi.add("Giovanni");
        nomi.add("Marta");
        nomi.add("Maria");

        Iterator<String> itr=nomi.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ordinaOggettiPersona();
    }

    private static void ordinaOggettiPersona() {
        // TreeSet richiede espressamente che il tipo degli oggetti che deve gestire implementino
        // l'interfaccia Comparable. In caso contrario si ottiene un errore di classCastExcepton
        Set<Persona> persone = new TreeSet<>();

        final Persona einstein = new Persona("Albert", "Einstein", "ABRMCCD..");
        final Persona bohr = new Persona("Niels", "Bohr", "NLSBHR..");
        final Persona curie = new Persona("Marie", "Curie", "CRMRI..");
        final Persona davinci = new Persona("Leonardo", "Da Vinci", "LNRDV..");

        persone.add(einstein);
        persone.add(bohr);
        persone.add(curie);
        persone.add(davinci);

        for(Persona persona: persone) {
            System.out.println(""+ persona.getCognome() + " " + persona.getNome());
        }

    }


}
