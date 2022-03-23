package com.assignment.cg.II;

public class Student {
	private String name;
	double[] marks;
	int lastIndex;
	
	public void getMarks(double[] marks) {
		if(marks.length == 6) {
			for(int i=0;i<6;i++) {
				if(marks[i]>=0 && marks[i]<=50) {
					this.marks[i] = marks[i];
				}
			}
		}
		else {
			System.out.println("There are exactly 6 subjects");
		}
	}
	
	
	
	
	
}
