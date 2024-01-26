package com.strings;

import java.util.Arrays;

public class SortArrAfterSquOfPosNeg {

	public static void main(String[] args) {
		int[] arr = {12, 3, 5, -2, -10, 20, 30 , -12};
		int[] squ = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			squ[i] = (int) Math.pow(arr[i], 2);
		}
		Arrays.sort(squ);
		System.out.println(Arrays.toString(squ));
	}

}
