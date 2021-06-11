package org.corso.calcolatrice.functional;

import java.util.Scanner;


/**
 * Dimostrazione di una applicazione del paradigma Funzionale in Java 8.
 * That's all power. 
 * 
 * @author remo
 *
 */
public class Calcolatrice {

    static private Scanner tastiera = new Scanner(System.in);

    // Programmazione funzionale!
    private FuncCalc mult = (Double op1, Double op2)-> op1 * op2;

    // assegna una funzione ad una variabile!
    private FuncCalc div = (Double op1, Double op2)->  op1 / op2;

	// quando questa funzione verrà eseguita...
    private FuncCalc sum = (Double op1, Double op2)-> {
    	// ...solo questa istruzione verra passata come valore della variabile "sum";
    	return op1 + op2;
    };  

    private FuncCalc sub = (Double op1, Double op2)-> op1 - op2;
    
    public static final int OPERATORE = 1;
    public static final int OPERANDO1 = 0;
    public static final int OPERANDO2 = 2;
    
    
    public static void main(String[] args) {

        Calcolatrice calcolatrice = new Calcolatrice();
		System.out.println("Calcolatrice Functional (digita l'espressione):");
        String espressione = tastiera.nextLine();
        
        // prende ogni carattere diverso da " " e lo mette in un elemento di un array. Esempio: [0]operando1 [1]operatore [2]operando
        String[] tokenizer = espressione.split("\\s+");

        Double operator1 = Double.valueOf(tokenizer[OPERANDO1]);
        Double operator2 = Double.valueOf(tokenizer[OPERANDO2]);
        
        FuncCalc calcolo = null;
        if (tokenizer[OPERATORE].equals("*"))
        	calcolo = calcolatrice.mult;
        if (tokenizer[OPERATORE].equals("/"))
        	calcolo = calcolatrice.div;
        if (tokenizer[OPERATORE].equals("-"))
        	calcolo = calcolatrice.sub;
        if (tokenizer[OPERATORE].equals("+"))
        	calcolo = calcolatrice.sum;            
        
        // 
        System.out.print("Ris: " + calcolo.calculate(operator1, operator2));
    }


}


