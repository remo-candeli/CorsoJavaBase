package org.corso.generics.magazzino.magazzinoC;


public class Magazzino<T> {

    private T[] prodotti;
    private int[] totali;

    public void carico(T prodotto, int quantita) {
    }

    public void scarico(T prodotto, int quantita) {

    }

    public int movimenti() {
        return 0;
    }
}
