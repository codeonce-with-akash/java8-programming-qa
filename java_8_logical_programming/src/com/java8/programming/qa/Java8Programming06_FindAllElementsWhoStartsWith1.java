package com.java8.programming.qa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 	Q6) Write a java program to find all elements from array who starts with 1
 */
public class Java8Programming06_FindAllElementsWhoStartsWith1 {

	public static void main(String[] args) {
		System.out.println("Elements who starts with 1 : " + findAllElementWhoStartWith1());
	}

	public static List<String> findAllElementWhoStartWith1() {
		int[] nums = { 5, 9, 11, 2, 8, 21, 1 };
		
		//1. convert array into stream and primitive into wrapper class.
		return Arrays.stream(nums).boxed()
				.map(s -> s + "")
				.filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
	}

}
