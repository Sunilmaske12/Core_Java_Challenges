package com.arrays;

public class InsertionOf2Arr {

	public static void main(String[] args) {
		
		int[] arr1 = {2, 4, 5, 6, 7, 8, 9, 10, 20};
		int[] arr2 = {2, 3, 5, 61, 7, 28, 9};
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
			
		}
	}

}
