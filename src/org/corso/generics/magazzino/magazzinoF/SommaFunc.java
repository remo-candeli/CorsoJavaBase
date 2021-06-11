package org.corso.generics.magazzino.magazzinoF;


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
public interface SommaFunc<X, S> {
	X sum(X num1, X num2, S sgn);
}