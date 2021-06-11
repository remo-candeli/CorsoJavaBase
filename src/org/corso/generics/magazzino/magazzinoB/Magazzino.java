package org.corso.generics.magazzino.magazzinoB;


public class Magazzino {

    private static int nrProdottiInseriti;
    private Prodotto[] prodotti;
    private int[] quantita;

    public Magazzino() {
        nrProdottiInseriti = 0;
        prodotti = new Prodotto[5000];
    }

    public void carico(Prodotto prodotto, int quantita) {
        prodotto.setQuantita(quantita);
        prodotti[nrProdottiInseriti++] = prodotto;
    }

    public void scarico(Prodotto prodotto, int quantita) {
        prodotto.setQuantita(quantita*(-1));
        prodotti[nrProdottiInseriti++] = prodotto;
    }

    public Prodotto[] movimenti() {
        return prodotti;
    }
}
