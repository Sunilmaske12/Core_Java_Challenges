package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DublicateElementPrint {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 10, 30, 50, 60, 50, 30};
		Arrays.sort(arr);
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				set.add(arr[i]);
			}
		}
		
		for(int i:set) {
			System.out.println(i);
		}
	}

}
