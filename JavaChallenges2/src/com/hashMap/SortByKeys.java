package com.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeys {

	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(10, 20);
		map.put(12, 13);
		map.put(6, 5);
		map.put(8, 32);
		map.put(89, 21);
		
		Map<Integer, Integer> tree=new TreeMap<Integer, Integer>(map);
		System.out.println(tree);

	}

}
