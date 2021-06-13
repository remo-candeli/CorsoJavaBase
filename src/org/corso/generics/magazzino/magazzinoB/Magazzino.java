package org.corso.generics.magazzino.magazzinoB;

/**
 * Questa classe non modella in modo elegante le sue strutture interne.
 * Utilizza una classe prodotto che al suo interno riporta una quantitá.
 * Questo attributo non dovrebbe appartenere a Prodotto.
 * Questa classe prova a gestire l'attributo quantitá ma lo fa con un secondo array
 * che, in qualche modo, dovrebbe essere correlato ai movimenti di carico e scarico che
 * andrebbero "ricordati".
 * Insomma: un pasticcio.
 */
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
