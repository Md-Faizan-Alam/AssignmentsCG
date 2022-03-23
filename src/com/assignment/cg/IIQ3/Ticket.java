package com.assignment.cg.IIQ3;

public class Ticket {
	String theatre;
	String movie;
	String[] seats;
	String time = "10:00am";
	int price;
	
	Ticket(Theatre theatre,String movie,int n){
		this.theatre = theatre.name;
		this.movie = movie;
		int unitPrice = theatre.movies.get(movie);
		this.price = n*unitPrice;
		this.seats = new String[n];
		for(int i=0;i<n;i++) {
			this.seats[i] = theatre.seats[i];
		}
	}
	
	public void getInfo() {
		System.out.println("\t\tTheatre : "+this.theatre);
		System.out.println("\t\tMovie : "+this.movie);
		
		System.out.print("\t\tSeats : ");
		for(String s:this.seats) {
			System.out.print(s+" ");
		}
		
		System.out.println("\n\t\tTime : "+this.time);
		System.out.println("\t\tFor "+this.seats.length+" people");
		System.out.println("\t\tTotal price : Rs"+this.price);
		
	}
	
}
