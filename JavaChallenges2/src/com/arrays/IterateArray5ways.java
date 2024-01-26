package com.arrays;

import java.util.Arrays;

public class IterateArray5ways {

	public static void main(String[] args) {

		String[] arr= {"sunil", "anil", "ram", "lakshman"};
		
		//way 1
		System.out.println("=============way 1=================");
		for(String s:arr) {
			System.out.println(s);
		}
		
		//way 2
		System.out.println("=============way 2=================");
		System.out.println(Arrays.toString(arr));
		
		//way3 ==> it doesnt work on primitive datatype
		System.out.println("=============way 3=================");
		System.out.println(Arrays.asList(arr));
		
		//way 4
		System.out.println("=============way 4=================");
		System.out.println(Arrays.deepToString(arr));
		
		//way 5
		System.out.println("=============way 5=================");
		Arrays.asList(arr).stream().forEach(s->System.out.println(s));
		
		Arrays.stream(arr).forEach(System.out::println);
		
		
	}

}
