package com.assignment.cg.II;

public class Cube extends Square implements Volume{
	
	Cube(double side, String name) {
		super(side, name);
	}

	@Override
	public double getVolume() {
		double volume;
		volume = Math.pow(this.side,3);
		return volume;
	}
	
}
