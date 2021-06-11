package org.corso.collections.liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nomiNonCiPiace = new ArrayList<>();

        List<String> nomi = new ArrayList<>();  // LinkedList, CopyOnWriteArrayList
        // aggiungere elementi
        nomi.add("Remo");
        nomi.add("Gino");
        nomi.add("Marco");
        nomi.add("Franco");
        nomi.add("Giovanni");
        nomi.add("Marta");
        nomi.add("Maria");

        // contare elementi di una lista
        System.out.println("Nr Nomi presenti: " + nomi.size());

        // rimuovere un elemento in base alla sua posizione
        System.out.println("Elemento rimosso: " + nomi.remove(1)); // rimuove Gino
        //System.out.println("Elemento rimosso: " + nomi.remove("Gino")); // rimuove Gino

        // cercare la posizione di un elemento in base al valore/
        System.out.println("Cerca Gino, ma nn lo trova e torna: "+ nomi.indexOf("Gino") );

        // ottenere il valore di un elemento in base alla sua posizione
        System.out.println("Alla posizione 1 c´é: " + nomi.get(1));

        // Modificare al volo un elemento in base alla sua posizione.
        nomi.set(1, "Arnaldo");
        System.out.println("Alla posizione 1 ora c´é: " + nomi.get(1));

        // ciclare tutta la lista
        for(String nome: nomi) {
            System.out.println("\tNome: " + nome);
        }

        // copiare una lista
        List<String> nomiCopiati = new ArrayList<>(nomi);

        // rimuovere un elemento ciclando una lista
        for(String nome: nomiCopiati) {
            if (nome.startsWith("M")) {
                nomiCopiati.remove(nome);
            }
        }
        System.out.println("Stampa la lista (BAD): "+ nomiCopiati); // ...comportamento inatteso!!!!

        // usiamo un iterator per cilare la lista rimuovendo gli elementi che desideriamo.
        Iterator<String> nomiIterator = nomi.listIterator();
        while(nomiIterator.hasNext()) {
            if (nomiIterator.next().startsWith("M")) {
                nomiIterator.remove();
            }
        }
        System.out.println("Stampa la lista (GOOD): "+ nomi);

        // pulire una lista
        System.out.println("Pulizia lista...");
        nomi.clear();
        System.out.println("Nomi presenti " + nomi.size());

        // verificare se la lista é vuota
        System.out.println("La lista é vuota? " + (nomi.isEmpty()?"Si":"No"));
    }
}
