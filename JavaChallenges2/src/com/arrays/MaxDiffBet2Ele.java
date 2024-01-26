package com.arrays;

public class MaxDiffBet2Ele {

	public static void main(String[] args) {

		int[] arr = {12, 3, 23, 45, 65, 21, 54, 6, 7, 76, 78, 100};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i:arr) {
			if(max<i) {
				max = i;
			}
			if(min>i) {
				min = i;
			}
		}
		System.out.println("min "+min);
		System.out.println("max "+max);
		System.out.println("Maximum difference : "+(max - min));
	}

}
