package com.assignment.cg.II;

import org.w3c.dom.ranges.RangeException;

public class Student {
	private String name;
	private double[] marks = new double[6];
	private static String[] subjects = new String[] {"Mathematics","Physics","Chemistry","Biology","Geography","History"};
	
	Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setMarks(double[] givenMarks) throws RangeException{
		for(int i=0;i<6;i++) {
			if(givenMarks[i]>=0 && givenMarks[i]<=50) {
				this.marks[i] = givenMarks[i];
			}
			else {
				throw new RangeException((short)0, "The marks entered for "+Student.subjects[i]+" is out of range");
			}
		}
	}
	
	public void getInfo() {
		System.out.println("Name : "+this.getName());
		for(int i=0;i<6;i++) {
			System.out.println(Student.subjects[i]+" : "+this.marks[i]);
		}
	}
	
	
	
	
	
}
