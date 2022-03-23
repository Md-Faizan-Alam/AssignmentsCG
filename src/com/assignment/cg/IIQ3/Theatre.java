package com.assignment.cg.IIQ3;

import java.util.HashMap;
import java.util.Map;

public class Theatre {
	String name;
	Map<String,Integer> movies = new HashMap<>();
	String[] seats = new String[] {"A1","A2","A3","B1","B2","B3","C1","C2","C3","D1"};
	Theatre(String name){
		this.name = name;
	}
	
}
