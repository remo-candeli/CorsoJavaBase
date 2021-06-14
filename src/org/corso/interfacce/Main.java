package org.corso.interfacce;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Playable dado = new Dado();
        Playable moneta = new Moneta();
        Playable rouolette = new Roulette();

        //gioca(dado);
        //gioca(moneta);
        //gioca(rouolette);

        Set<Playable> giochi = new HashSet<>();
        giochi.add(dado);
        giochi.add(moneta);
        giochi.add(rouolette);
        for(Playable playable: giochi) {
            gioca(playable);
        }

    }

    public static void gioca(Playable playable) {
        playable.execute();
        System.out.println(playable.verify());
    }
}
