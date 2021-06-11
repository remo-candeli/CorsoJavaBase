package org.corso.calcolatrice.oop;

public class Sum extends Operazione{

	@Override
	protected double esegui() {
		return this.getOp1() + this.getOp2(); 
	}

}
