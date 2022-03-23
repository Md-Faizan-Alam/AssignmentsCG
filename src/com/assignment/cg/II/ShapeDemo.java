package com.assignment.cg.II;

public class ShapeDemo {
	public static void main(String[] args) {
		
		Square mySquare = new Square(10,"mySquare");
		System.out.println("The name of the square is "+mySquare.getName()+" and it has an area of "+round(mySquare.getArea())+" square units\n");
		
		Cube myCube = new Cube(12,"myCube");
		System.out.println("The name of the cube is "+myCube.getName()+" and it has a volume of "+round(myCube.getVolume())+" cubic units\n");
		
		Circle myCircle = new Circle(10,"myCircle");
		System.out.println("The name of the circle is "+myCircle.getName()+" and it has an area of "+round(myCircle.getArea())+" square units\n");
		
		Cylinder myCylinder = new Cylinder(10,12,"myCylinder");
		System.out.println("The name of the cylinder is "+myCylinder.getName()+" and it has a volume of "+round(myCylinder.getVolume())+" cubic units\n");
		
		Sphere mySphere = new Sphere(14,"mySphere");
		System.out.println("The name of the sphere is "+mySphere.getName()+" and it has a volume of "+round(mySphere.getVolume())+" cubic units\n");
		
		Glome myGlome = new Glome(16,"myGlome");
		System.out.println("The name of the glome is "+myGlome.getName()+" and it has a volume of "+round(myGlome.getVolume())+" cubic units\n");
	
	}
	
	// A method to round the double values till up to 2 decimal places
	public static double round(double number) {
		double roundedNumber = (Math.round(number*100))/100.00;
		return roundedNumber;
	}
}
