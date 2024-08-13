package com.java8.programming.qa;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Q1) Write a java program to count the occurrence of each character in a String.
 */
public class Java8Programming01_Stream {
	public static void main(String[] args) {
		Map<String,Long> map = countTheOccurrence("mynameisakash");
		System.out.println(map);
	}

	public static Map<String,Long> countTheOccurrence(String input){
		//1. convert input string into array of string
		String[] result = input.split("");
		
		//System.out.println(Arrays.toString(result));	//[m, y, n, a, m, e, i, s, a, k, a, s, h]
		//Map<String,List<String>> map = Arrays.stream(result).collect(Collectors.groupingBy(s->s));	//{a=[a, a, a], s=[s, s], e=[e], h=[h], i=[i], y=[y], k=[k], m=[m, m], n=[n]}
		
		//2. convert array of string into stream
		Map<String,Long> map = Arrays.stream(result).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return map;
	}
}
