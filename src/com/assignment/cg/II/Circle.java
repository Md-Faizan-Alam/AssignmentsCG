package com.assignment.cg.II;

public class Circle extends Shape implements Area {
	double radius;
	
	Circle(double radius, String name){
		this.radius = radius;
		this.name = name;
	}
	
	@Override
	public double getArea() {
		double area = Math.PI;
		area *= Math.pow(this.radius,2);
		return area;
	}
	
}
