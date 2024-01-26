package com.arrays;

import java.util.Arrays;

public class MoveNegToStart {

	public static void main(String[] args) {

		int[] arr= {1, -1, 3, 4, -3, -5, 6, 7, 7, -20};
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<0) {
				for(int j=i; j>=1; j--) {
					if(arr[j-1] <0) {
						break;
					}
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

		
	}

}
