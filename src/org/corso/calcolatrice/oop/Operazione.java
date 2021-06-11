package org.corso.calcolatrice.oop;

public abstract class Operazione {
	
	private double op1;
	private double op2;
	
	public double calcola(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
		return this.esegui();
	}
	
	abstract protected double esegui();

	public double getOp1() {
		return op1;
	}


	public double getOp2() {
		return op2;
	}
}
