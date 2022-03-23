package com.assignment.cg.II;

public class Square extends Shape implements Area{
	double side;
	
	Square(double side,String name){
		this.side = side;
		this.name = name;
	}
	
	@Override
	public double getArea() {
		double area;
		area = Math.pow(this.side,2);
		return area;
	}
}
