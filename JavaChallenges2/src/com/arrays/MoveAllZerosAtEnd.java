package com.arrays;

import java.util.Arrays;

public class MoveAllZerosAtEnd {

	public static void main(String[] args) {
		int[] arr= {1, 3, 5 , 0, 5, 0, 2, 0, 23, 0, 23, 0, 0 ,0};
		
		int lastNonZeroPos = arr.length-1;
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]==0) {
				for(int j=i; j<lastNonZeroPos; j++) {
					arr[j]=arr[j+1];
				}
				arr[lastNonZeroPos]=0;
				lastNonZeroPos--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
