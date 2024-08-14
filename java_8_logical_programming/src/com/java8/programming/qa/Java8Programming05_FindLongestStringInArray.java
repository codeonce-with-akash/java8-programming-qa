package com.java8.programming.qa;

import java.util.Arrays;

/*
 * 	Q5) Write a java program to find longest string from given array.
 */
public class Java8Programming05_FindLongestStringInArray {

	public static void main(String[] args) {
		System.out.println("Longest string in array is : " + findLongestStringInArray());
	}
	
	public static String findLongestStringInArray() {
		String[] strArray = {"akash", "hiwale", "springboot", "microservices", "javaprogramming"};
		
		//1. convert string array into stream and process it
		String longestString = Arrays.stream(strArray)
		.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		return longestString;
	}

}
