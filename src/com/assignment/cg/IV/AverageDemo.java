package com.assignment.cg.IV;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AverageDemo {
	public static void main(String[] args) {
		List<Float> arr = Arrays.asList(1.2f,3.4f,5.6f,7.8f,9.0f);
		Stream<Float> arrStream = arr.stream();
		Optional<Float> average = arrStream.reduce((f1,f2)->f1+f2);
		average.ifPresent(f->System.out.println("The average of the numbers is "+f));
	}
}
