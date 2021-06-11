package org.corso.calcolatrice.functional;


/**
 * Questa è una interfaccia funzionale:
 * Una interfaccia che dichiara un solo metodo.
 * Si presta quindi bene a gestire le lambda per ricevere esclusivamente il "corpo" del metodo da eseguire.
 * 
 * 
 * @author remo
 *
 */
@FunctionalInterface
public interface FuncCalc {
	Double calculate( Double num1, Double num2 );
}