 package com.java8.programming.qa;

import java.util.Arrays;
import java.util.Comparator;

/*
 *	Q4) Write a java program to find second highest number from given array 
 */
public class Java8Programming04_Find2ndHighestNumInArray {

	public static void main(String[] args) {
		System.out.println("Second highest number is: " + find2ndHighestNumber());
	}
	
	public static Integer find2ndHighestNumber() {
		
		int[] nums = {5, 9, 11, 2, 8, 21, 1};
		
		//1. convert arrays to stream
		return Arrays.stream(nums).boxed()
		//.sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0)
		//.sorted((i1,i2)->i2.compareTo(i1))
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().get();
	}

}
