package org.corso.bindings;



public class Main {

    public static void main(String[] args) {
        // Binding Statico
        Automobile automezzoA = new Automobile();
        Moto automezzoB = new Moto();

        // stampaSoloMoto(automezzoA); Non si puó fare perché il metodo stampa solo Moto
        stampaSoloMoto(automezzoB);

        // Binding Dinamico
        Automezzo automezzo1 = new Automobile();
        Automezzo automezzo2 = new Moto();

        stampaTuttiITipiDiAutomezzo(automezzo1);
        stampaTuttiITipiDiAutomezzo(automezzo2);
    }

    /**
     * Binding Dinamico perché nonostante il metodo riceva un Tipo Automezzo,
     * quando viene chiamato il metodo stampa viene di fatto chiamato il metodo
     * associato ad uno dei due oggetti concreti(Istanze) Automobile o Moto passati al metodo.
     *
     * IL BINDING DINAMICO FAVORISCE LA PROGRAMMAZIONE GENERICA.
     * LA PROGRAMMAZIONE GENERICA FAVORISCE IL RIUSO DEL CODICE.
     * LA PROGRAMMAZIONE GENERICA E' GENERALMENTE PIÚ COMPLESSA.
     *
     * @param automezzo
     */
    public static void stampaTuttiITipiDiAutomezzo(Automezzo automezzo) {
        automezzo.stampa();
    }

    /**
     * No Binding dinamico.
     * Questo metodo vuole solo un tipo Moto.
     * @param automezzo
     */
    public static void stampaSoloMoto(Moto automezzo) {
        automezzo.stampa();
    }
}
