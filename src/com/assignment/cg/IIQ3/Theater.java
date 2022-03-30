package com.assignment.cg.IIQ3;

import java.util.ArrayList;

public class Theater {
	String name;
	static Movie[] moviesPlaying = new Movie[] {new Movie("The Batman",220),new Movie("Gangubai Kathavadi",210),new Movie("Bachchhan Pandey",200),new Movie("Turning Red",210)}; 
	ArrayList<Movie> moviesAvailable = new ArrayList<>();
	String[] seats;
	
	Theater(String name,int[] indices,int noOfSeats){
		this.name = name;
		for(int i:indices) {
			moviesAvailable.add(moviesPlaying[i]);
		}
		this.seats = setSeats(noOfSeats);
	}
	
	private static String[] setSeats(int n) {
		String[] str = new String[n];
		char letter;
		int number;
		for(int i=0;i<n;i++) {
			letter =(char)('A'+(i/4));
			number = i+1-4*(i/4);
			str[i] = letter + Integer.toString(number);
		}
		
		return str;
	}
}
