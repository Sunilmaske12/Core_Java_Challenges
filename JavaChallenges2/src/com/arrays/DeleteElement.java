package com.arrays;

import java.util.Arrays;

//deleting an element from array
public class DeleteElement {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6 };
		System.out.println("Old array : "+Arrays.toString(arr));
		
		int element = 4;		
		int[] newArr = deleteAnElement(arr, element);
		System.out.println("New array : "+Arrays.toString(newArr));
		

	}

	private static int[] deleteAnElement(int[] arr, int element) {
		int[] newArr = new int[arr.length-1];
		int index = 0;
		for(int i:arr) {
			if(i!=element) {
				newArr[index] = i;
				index++;
			}
		}
		return newArr;
		
	}

}
