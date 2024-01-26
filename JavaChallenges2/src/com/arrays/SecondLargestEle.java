package com.arrays;

import java.util.Arrays;

public class SecondLargestEle {

	public static void main(String[] args) {
		int[] arr= {10, 13, 5, 7, 9, 11, 12 };
		//method 1
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		//method 2
		int[] arr2= {10, 13, 5, 7, 9, 11, 12 };
		int largest = Integer.MIN_VALUE;
		int secondLarge = -1;
		for(int i=0; i<arr2.length; i++) {
			if(arr[i]>largest) {
				secondLarge = largest;
				largest = arr[i];
			}
		}
		System.out.println(secondLarge);
	}

}
