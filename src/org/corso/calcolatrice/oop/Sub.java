package org.corso.calcolatrice.oop;

public class Sub extends Operazione{

	@Override
	protected double esegui() {
		return this.getOp1() - this.getOp2(); 
	}

}
