package com.assignment.cg.II;

public class Cylinder extends Circle implements Volume{
	private double height;
	
	Cylinder(double height,double radius,String name){
		super(radius,name);
		this.height = height;
	}

	@Override
	public double getVolume() {
		double volume;
		volume = super.getArea()*this.height;
		return volume;
	}
}
