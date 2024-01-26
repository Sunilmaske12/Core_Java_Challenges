package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToArrayList3ways {

	public static void main(String[] args) {
		
		Integer[] a1= {1, 2, 3 , 4, 5, 6};
		
		//way1
		List<Integer> l1=Arrays.asList(a1);
		System.out.println(l1);
		
		//way2
		List<Integer> l2=new ArrayList<Integer>();
		Collections.addAll(l2, a1);
		System.out.println(l2);
		
		//way3
		List<Integer> l3=new ArrayList<Integer>();
		for(Integer i:a1) {
			l3.add(i);
		}
		System.out.println(l3);

	}

}
