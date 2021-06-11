package org.corso.calcolatrice.oop;

import java.util.Scanner;

/**
 * Dimostrazione di una applicazione del paradigma OOP in Java 8.
 *
 * @author remo
 */
public class Calcolatrice {

    static private Scanner tastiera = new Scanner(System.in);

	
    public static final int OPERATORE = 1;
    public static final int OPERANDO1 = 0;
    public static final int OPERANDO2 = 2;
	
	
	public static void main(String[] args) {

		Calcolatrice calcolatrice = new Calcolatrice();
        
		System.out.println("Calcolatrice OOP (digita l'espressione):");
        String espressione = tastiera.nextLine();
        String[] tokens = espressione.split("\\s+");

        Double[] operandi = new Double[2];
        calcolatrice.trovaOperandi(tokens, operandi);        
        Operazione operazione = calcolatrice.trovaOperatore(tokens);
        
        calcolatrice.esegui(operazione, operandi[0], operandi[1]);
	}
	
	
	/**
	 * trovaOperandi
	 * 
	 * @param tokens
	 * @param operandi
	 */
	public void trovaOperandi(String[] tokens, Double[] operandi) {
        // prende ogni carattere diverso da " " e lo mette in un elemento di un array
        operandi[0] = Double.valueOf(tokens[OPERANDO1]);
        operandi[1] = Double.valueOf(tokens[OPERANDO2]);
	}

	
	/**
	 * trova
	 * 
	 * 
	 * @param tokens
	 * @return
	 */
	public Operazione trovaOperatore(String[] tokens) {
        Operazione operazione = null;
        if (tokens[OPERATORE].equals("*"))
        	operazione = new Mult();
        if (tokens[OPERATORE].equals("/"))
        	operazione = new Div();
        if (tokens[OPERATORE].equals("-"))
        	operazione = new Sub();
        if (tokens[OPERATORE].equals("+"))
        	operazione = new Sum();
        
		return operazione;
	}
	
	
	public void esegui(Operazione operazione, double o1, double o2) {
		
		System.out.println(operazione.calcola(o1, o2));
	}

}
