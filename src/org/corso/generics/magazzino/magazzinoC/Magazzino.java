package org.corso.generics.magazzino.magazzinoC;


import org.corso.generics.magazzino.Prodotto;

/**
 * Questa classe inizia a rendere le cose un po piú sensate:
 * Si introduce il concetto di Generic. Il parametro di tipo T ora é associato alla variabile prodotti
 * Qunindi, ora, Magazzino gestisce un elenco di prodotti di qualunque tipo.
 * C'é ancora il problema della quantitá. L'attributo che prima si chiamata quantitá, ora é stato rinominato
 * in "totali" e quindi l'idea potrebbe essere quella di fare in modo che ad ogni elemento presente nell´array
 * prodotti si possa corrispondere un totale nella stessa posizione dell'array totali.
 * Ma ancora non ci siamo. La struttura é ancora debole: questi due attributi devono essere fortemente coesi nel
 * contesto dei movimenti di un magazzino.
 */
public class Magazzino<T> {

    private T[] prodotti;
    private int[] totali;

    /**
     * Carica un prodotto di tipo T con una quantitá
     * @param prodotto
     * @param quantita
     */
    public void carico(T prodotto, int quantita) {
        prodotti[0] = prodotto;
    }

    /**
     * Scarica un prodotto di tipo T con una quantitá
     *
     * @param prodotto
     * @param quantita
     */
    public void scarico(T prodotto, int quantita) {

    }

    public int movimenti() {
        return 0;
    }
}
