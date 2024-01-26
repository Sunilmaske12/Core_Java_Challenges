package com.arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = {12, 14, 20, 23, 34,50, 52, 60};
		int target = 20;
		int start = 0;
		int end = arr.length-1;
		int mid =  end - (end - start)/2 ;
		int found = -1;
		while(start<=end) {
			if(arr[mid] == target) {
				found = mid;
				break;
			}
			else if(arr[mid]>target) {
				end = mid-1;
			}else {
				start = mid+1; 
			}
			mid =  end - (end - start)/2 ;
		}
		System.out.println("Element found at "+found);
	}

}
