package com.assignment.cg.I;

public class Box {
	private float length;
	private float height;
	private float breadth;
	
	Box(Object obj){
		float [] sides = (float[])obj;
		this.length = sides[0];
		this.height = sides[1];
		this.breadth = sides[2];
	}
	public float volume() {
		return length*height*breadth;
	}
	public static void main(String[] args) {
		Box myBox = new Box(new float[] {15.8f,25.2f,8.3f});
		System.out.println("The Volume of the Box is "+myBox.volume()+" cubic units");
	}
}
