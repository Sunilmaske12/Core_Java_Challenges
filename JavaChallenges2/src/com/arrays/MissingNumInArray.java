package com.arrays;

import java.util.Arrays;

public class MissingNumInArray {

	public static void main(String[] args) {
		
		int[] arr= {2, 4, 6, 7, 9};
		
		Arrays.sort(arr);
		int index = 0;		
		for(int i=arr[0]; i<=arr[arr.length-1]; i++) {
			if(i==arr[index]) {
				index++;
			}else {
				System.out.println(i);
			}
		}
		
		

	}

}
