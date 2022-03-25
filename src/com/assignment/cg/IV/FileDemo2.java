package com.assignment.cg.IV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileDemo2 {
	public static void main(String[] args) {
		
		File file = new File("UpperCase.txt");
		
		
		// Making sure that the file is there to be used
		boolean created = false;
		if(file.exists()) {
			System.out.println(file.getName()+" has been opened Successfully");
		}
		else {
			try {
				created = file.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(created) {
				System.out.println(file.getName()+" has been created");
			}
			else {
				System.out.println("Unable to create file");
			}
		}
		
		
		// Prompt for user input
		System.out.print("\nYour text goes here : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		// Writing into the file
		BufferedWriter pen = null;
		try {
			pen = new BufferedWriter(new FileWriter(file));
			pen.write(str.toUpperCase());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pen.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// Reading from the file
		BufferedReader eyes = null;
		try {
			eyes = new BufferedReader(new FileReader(file));
			System.out.println("The file now contains the following :");
			eyes.lines().forEach(line -> System.out.println(line));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				eyes.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
	}
}
