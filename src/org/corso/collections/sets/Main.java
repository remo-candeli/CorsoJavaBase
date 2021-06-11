package org.corso.collections.sets;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> nomi = new HashSet<>();  // LinkedHashSet, TreeSet, ConcurrentHashMap, CopyOnWriteArraySet
        // aggiungere elementi
        nomi.add("Remo");
        nomi.add("Gino");
        nomi.add("Marco");
        nomi.add("Franco");
        nomi.add("Giovanni");
        nomi.add("Marta");
        nomi.add("Maria");


        // contare elementi di un Set
        System.out.println("Nr Nomi presenti: " + nomi.size());

        // rimuovere un elemento in base alla sua posizione
        // Non so puó fare!

        // cercare la posizione di un elemento in base al valore/
        // non esiste una posizione in un Set

        // ottenere il valore di un elemento in base alla sua posizione
        // non esiste una posizione in un Set

        // Modificare al volo un elemento in base alla sua posizione.
        // non si puó fare

        // ciclare tutto il Set
        for(String nome: nomi) {
            System.out.println("\tNome: " + nome);
        }

        // copiare un Set
        Set<String> nomiCopiati = new HashSet<>(nomi);

        // rimuovere un elemento ciclando una lista
        for(String nome: nomiCopiati) {
            if (nome.startsWith("M")) {
              //nomiCopiati.remove(nome);
            }
        }
        // ...comportamento Atteso!!
        // (Exception in thread "main" java.util.ConcurrentModificationException

        // usiamo un iterator per ciclare il Set rimuovendo gli elementi che desideriamo.
        Iterator<String> nomiIterator = nomiCopiati.iterator();
        while(nomiIterator.hasNext()) {
            if (nomiIterator.next().startsWith("M")) {
                nomiIterator.remove();
            }
        }
        System.out.println("Stampa il Set (GOOD): "+ nomi);

        System.out.println("Esiste Gino nel Set? " + (nomi.contains("Gino")?"Si":"No"));

        // pulire un Set
        System.out.println("Pulizia Set...");
        nomi.clear();
        System.out.println("Nomi presenti " + nomi.size());

        // verificare se il Set é vuoto
        System.out.println("Il Set é vuoto? " + (nomi.isEmpty()?"Si":"No"));

    }

}
