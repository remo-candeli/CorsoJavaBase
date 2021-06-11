package org.corso.generics.magazzino.magazzinoC;

import org.corso.generics.magazzino.Prodotto;

public class App {

    public static void main(String[] args) {

        Magazzino<Prodotto> magazzino = new Magazzino<>();
        magazzino.carico(new Prodotto(), 5);
        magazzino.carico(new Prodotto(), 6);

    }
}
