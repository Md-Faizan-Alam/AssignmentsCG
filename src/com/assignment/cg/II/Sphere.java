package com.assignment.cg.II;

public class Sphere extends Circle implements Volume{

	Sphere(double radius, String name) {
		super(radius, name);
	}

	@Override
	public double getVolume() {
		double volume = (4/3);
		volume *= super.getArea()*this.radius;
		return volume;
	}

}
