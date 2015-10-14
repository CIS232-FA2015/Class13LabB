package cis232.classlab;

public class Barn implements Structure {
	double sqFt;
	int stalls;
	
	public Barn(int stalls, double squareFeet){
		this.stalls = stalls;
		this.sqFt = squareFeet;
	}
	
	@Override
	public double getSquareFeet() {
		return sqFt;
	}
	
	public String toString(){
		return String.format("%d stalled barn", this.stalls);
	}

}
