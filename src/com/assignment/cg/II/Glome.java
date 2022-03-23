package com.assignment.cg.II;

public class Glome extends Sphere implements Volume{

	Glome(double radius, String name) {
		super(radius, name);
	}
	
	@Override
	public double getVolume() {
		double volume = 2*Math.pow(Math.PI, 2);
		volume *= Math.pow(this.radius,3);
		return volume;
	}
	
}
