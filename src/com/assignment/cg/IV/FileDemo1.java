package com.assignment.cg.IV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemo1 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("NoteBook.txt");
		
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
		

		
		// Making the byte array
		
		// Method 1
//		byte[] barr = new byte[50];
//		for(int i=0;i<50;i++) {
//			try {
//				barr[i] = (byte)System.in.read();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//Method 2
		String str = "Hello World";
		byte[] barr = new byte[str.length()];
		for(int i=0;i<str.length();i++) {
			barr[i] = (byte) str.charAt(i);
		}
		
		
		// Instantiating FileOutputStream
		OutputStream f = new FileOutputStream(file);
		
		// Using write method for writing in the file
		try {
			f.write(barr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Closing the FileOutputStream
		try {
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
