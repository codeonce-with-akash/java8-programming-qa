package com.java8.programming.qa;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 *	Q3) Write Java program to find first non-repeate element from a given string 
 */
public class Java8Programming03_FindFirstNonRepeatedElement {

	public static void main(String[] args) {
		System.out.println("First non-repeate element is : " + findFirstNonRepeateElement("mynameisakash"));
	}
	
	public static String findFirstNonRepeateElement(String input) {
		//1. convert input string into array of string
		String[] result = input.split("");
		
		//2. convert the above result array into stream and process it
		return Arrays.stream(result)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(v -> v.getValue() == 1)		//first non-repeate element
		//.filter(v -> v.getValue() > 1)	//first repeated element
		.findFirst().get().getKey();
	}

}
