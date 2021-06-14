package org.corso.interfacce;

import java.util.Random;

public class Roulette implements Playable {

    private int number;

    @Override
    public String verify() {
        return "Risultato: " + number;
    }

    @Override
    public void execute() {
        System.out.println("Esegue il lancio di " + getClass().getSimpleName());
        number = getRandomNumberUsingInts(1, 36);
    }

    public int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
