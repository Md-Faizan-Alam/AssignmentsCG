package com.assignment.cg.IIQ3;

import java.util.ArrayList;

// All additional methods are implemented in an external Class named ToolBox
// and used through an object 'tool' of that Class

public class BookTickets {
	public static void main(String[] args) {
		
		// ToolBox object
		ToolBox tool = new ToolBox();
		
		// Instantiating an array of theaters
		Theater[] allTheaters = new Theater[] {new Theater("INOX",new int[] {0,1,2},10),new Theater("Lake Mall",new int[] {0,1,2,3},6),new Theater("Quest Mall",new int[] {0,2,3},6)};
		
		// Miscellaneous Instantiations
		String border = tool.charLine('-', tool.width);
		int input = 0, movieIn = 0, theaterIn = 0, count = 0;
		
		// Presenting the user with options
		System.out.println(border);
		tool.alignText("1. List of Movies and their Prices");
		tool.alignText("2. Book Tickets from your nearest theatres");
		System.out.println(border);
		
		input = tool.takeInput(2);
		
		//	First Case
		if(input==1) {
			//	Print the list of available movies
			tool.alignText("Movies available are");
			for(int i=0;i<Theater.moviesPlaying.length;i++) {
				System.out.println("\t\t"+(i+1)+". "+Theater.moviesPlaying[i].name+"\t\tRs."+Theater.moviesPlaying[i].price);
			}
			
			//	Take input from the user as to which movie they want to watch
			movieIn = tool.takeInput(Theater.moviesPlaying.length);
			movieIn--;
			
			//	Print the list of theaters that have that movie as available
			count = 1;
			ArrayList<Theater> someTheaters = new ArrayList<>();
			tool.alignText("Theaters playing "+Theater.moviesPlaying[movieIn].name);
			for(int i=0;i<allTheaters.length;i++) {
				if(allTheaters[i].moviesAvailable.contains(Theater.moviesPlaying[movieIn])) {
					someTheaters.add(allTheaters[i]);
					System.out.println("\t\t"+count+". "+allTheaters[i].name+"\t\t"+allTheaters[i].seats.length);
					count++;
				}
			}
			
			// Take input from the user as to which theater they want to watch the movie in
			theaterIn = tool.takeInput(someTheaters.size());
			theaterIn--;
			
			//	Ask for the number of seats they want to book
			//	Reusing the integer 'count' for storing the user input
			/*	Note : The user should be provided with the number of seats available
				for each available theater*/
			System.out.print("\t\tEnter the number of seats : ");
			count = tool.takeInput(someTheaters.get(theaterIn).seats.length);
			
			//	Create the ticket object using the data acquired from the user
			Ticket myTicket = new Ticket(someTheaters.get(theaterIn), movieIn, count);
			//	Print the ticket details
			System.out.println(border);
			myTicket.getInfo();
			System.out.println(border);
		}
		
		//	Second Case
		else if(input==2) {
			// Print the list of theaters available
			tool.alignText("Theaters available are");
			for(int i=0;i<allTheaters.length;i++) {
				System.out.println("\t\t"+(i+1)+". "+allTheaters[i].name+"\t\t"+allTheaters[i].seats.length);
			}
			
			//	Take input from the user as to which theater they want to watch the movie in
			theaterIn = tool.takeInput(allTheaters.length);
			theaterIn--;
			
			//	Print the list of movies available in that specific theater
			tool.alignText("Movies available are");
			for(int i=0;i<allTheaters[theaterIn].moviesAvailable.size();i++) {
				System.out.println("\t\t"+(i+1)+". "+allTheaters[theaterIn].moviesAvailable.get(i).name+"\t\tRs."+allTheaters[theaterIn].moviesAvailable.get(i).price);
				
			}
			//	Take input from the user as to which movie they want to watch
			movieIn = tool.takeInput(allTheaters[theaterIn].moviesAvailable.size());
			movieIn--;
			
			//	Ask for the number of seats they want to book
			System.out.print("\t\tEnter the number of seats : ");
			count = tool.takeInput(allTheaters[theaterIn].seats.length);
			
			//	Create the ticket object using the data acquired from the user
			Ticket myTicket = new Ticket(allTheaters[theaterIn], movieIn, count);
			//	Print the ticket details
			System.out.println(border);
			myTicket.getInfo();
			System.out.println(border);
		}
		
	}
}
