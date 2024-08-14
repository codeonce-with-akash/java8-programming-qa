package com.java8.programming.qa;

import java.util.Arrays;
import java.util.List;

/*
 * 	Q7) String.join() method example
 * 	input: Arrays.asList("1", "2", "3", "4")
 * 	output: 1-2-3-4
 */
public class Java8Programming07_StringJoinMethodEx {

	public static void main(String[] args) {
		List<String> nums = Arrays.asList("1", "2", "3", "4");
		String results = String.join("-", nums);
		System.out.println(results);
	}

}
