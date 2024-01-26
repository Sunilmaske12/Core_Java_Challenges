package com.num_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementPresentInAtLeast2arr {

	public static void main(String[] args) {
		Integer[] a1= {1,2,3,4,5};
		Integer[] a2= {1,5 ,4,9,0,23};
		Integer[] a3= {10,20,30,23};

		List<Integer> l1 =new ArrayList<Integer>(Arrays.asList(a1));
		List<Integer> l2 =new ArrayList<Integer>(Arrays.asList(a2));
		List<Integer> l3 =new ArrayList<Integer>(Arrays.asList(a3));
		
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(l1);
		set.addAll(l2);
		set.addAll(l3);
		
		for(int i:set) {
			if((l1.contains(i) && l2.contains(i)) || (l1.contains(i) && l3.contains(i)) || (l3.contains(i) && l2.contains(i))) {
				System.out.println(i);
			}
		}
	}

}
