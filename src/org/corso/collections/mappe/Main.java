package org.corso.collections.mappe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // differenze tra HashMap e HashTable https://www.javatpoint.com/difference-between-hashmap-and-hashtable
        // differenze tra HashMap e TreeMap https://www.javatpoint.com/difference-between-hashmap-and-treemap

        Map<String, Integer> nomi = new HashMap<>();   // HashTable, EnumMap, LinkedHashMap, Properties, TreeMap, WeakHashMap, ConcurrentHashMap
        nomi.put("Einstein", 58);
        nomi.put("Bohr", 67);
        nomi.put("Curie", 57);
        nomi.put("Copernico", 61);
        nomi.put("Heisemberg", 49);
        nomi.put("Pauli", 75);
        nomi.put("Fermi", 80);

        // contare elementi di una Mappa
        System.out.println("Nr Nomi presenti: " + nomi.size());

        // cambiare il valore di un elemento in base alla chiave
        nomi.put("Einstein", 62);
        System.out.println("Einstein ora ha " + nomi.get("Einstein") + " anni");

        // ciclare una mappa (modo 1)
        for(String nome: nomi.keySet()) {
            System.out.println("Modo 1\t nome: " + nome + " etá: " + nomi.get(nome));
        }

        // ciclare una mappa (modo 2)
        for(Map.Entry<String, Integer> nome: nomi.entrySet()) {
            System.out.println("Modo 2\t nome: " + nome.getKey() + " etá: " + nome.getValue());
        }

        // No Good!
        for(String nome: nomi.keySet()) {
            //nomi.remove(nome);
        }

        // Utilizza un iteratore su chiavi (slice verticale)
        Iterator<String> nomiIteratorKeys = nomi.keySet().iterator();
        while(nomiIteratorKeys.hasNext()) {
            if (nomiIteratorKeys.next().startsWith("C")) {
                nomiIteratorKeys.remove();
            }
        }

        // Utilizza un iteratore su entries (slice orizzontale)
        Iterator<Map.Entry<String, Integer>> nomiIterator = nomi.entrySet().iterator();
        while(nomiIterator.hasNext()) {
            if (nomiIterator.next().getKey().startsWith("C")) {
                nomiIterator.remove();
            }
        }
        System.out.println("Stampa il Set (GOOD): "+ nomi);
    }
}
