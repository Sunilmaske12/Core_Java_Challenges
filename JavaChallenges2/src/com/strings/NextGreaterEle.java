package com.strings;

public class NextGreaterEle {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 12, 13, 8, 9, 7 , 10};
		
		for(int i=0; i<arr.length; i++) {
			int nextEl = -1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					nextEl = arr[j];
					break;
				}
			}
			System.out.println(arr[i]+" : "+nextEl);
		}

	}

}
