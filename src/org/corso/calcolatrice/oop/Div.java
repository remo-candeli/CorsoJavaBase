package org.corso.calcolatrice.oop;

public class Div extends Operazione{

	@Override
	protected double esegui() {
		if (this.getOp2()==0.0)
			return 0;
		return this.getOp1() / this.getOp2(); 
	}

}
