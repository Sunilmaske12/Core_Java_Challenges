package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4, 5, 6, 2, 3, 4, 5, 2, 3, 2, 10};
		
		int majorityEle = arr[0];
		int count=1;
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i], 1);
			}else {
				map.replace(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.toString());
			if(count<(int)entry.getValue()) {
				majorityEle = (int)entry.getValue();
			}
		}
		
		System.out.println(majorityEle);

	}

}
