package com.java8.programming.qa;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 *	Q2) Write java program to find all duplicate elements from a given string 
 */
public class Java8Programming02_FindAllDuplicateElements {

	public static void main(String[] args) {
		System.out.println("Duplicate elements are: "+findDuplicateElementsInString("mynameisakash"));
		System.out.println("Unique elements are: "+findUniqueElements("mynameisakash"));
	}
	
	public static List<String> findDuplicateElementsInString(String input){
		//1. convert input string into array
		String[] result = input.split("");
		
		//2. covert array of string into stream
		return Arrays.stream(result)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.filter(v -> v.getValue() > 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
	}
	
	//find unique elements in input string
	public static List<String> findUniqueElements(String input){
		//1. convert input string into array of string
		String[] result = input.split("");
		
		//2. convert result array of string into stream and process it
		return Arrays.stream(result)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(v -> v.getValue() == 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
	}	
}
