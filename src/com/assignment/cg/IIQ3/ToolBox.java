package com.assignment.cg.IIQ3;

import java.util.Scanner;

public class ToolBox {
	int width = 70;
	Scanner sc = new Scanner(System.in);
	
	// Returns a String made up of a single character c repeated n times
	public String charLine(char c,int n) {
		String str = "";
		for(int i=0;i<n;i++) {
			str+=c;
		}
		return str;
	}
	
	// Aligns and prints the given string by adding '-' on both sides
	public void alignText(String str) {
		int n = (width-str.length())/2;
		str = charLine('-',n) + str + charLine('-', (width-n-str.length()) );
		System.out.println(str);
	}
	
	// Prints the necessary messages before terminating the application
	public void terminateApp() {
		System.out.println("\t\tInvalid Input");
		System.out.println("\t\tApplication Closed");
		System.exit(0);
	}
	
	// Takes input from the user and terminates the application if the input is out of range
	public int takeInput(int limit) {
		int input = 0;
		try {
			input = sc.nextInt();
		}catch(Exception e) {
			terminateApp();
		}finally {
			if( input<1 || input>limit ) {
				terminateApp();
			}
		}
		return input;
	}
}
