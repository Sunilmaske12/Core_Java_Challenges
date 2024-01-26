package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap5waysIteration {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=1; i<=10; i++) {
			map.put(i, i*10);
		}
		
		iterateM1(map);
		iterateM2(map);
		iterateM3(map);
		iterateM4(map);
		iterateM5(map);
		
		
		
		
	}

	private static void iterateM5(Map<Integer, Integer> map) {
		System.out.println("\n\n===============forEach===================");
		map.forEach((key, value)->{
			System.out.println("Key :"+key+" value :"+value);
		});
	}

	private static void iterateM4(Map<Integer, Integer> map) {
		System.out.println("\n\n===============Streams===================");
		map.entrySet().stream().forEach(e->{
			System.out.println(e);
		});
		
	}

	private static void iterateM3(Map<Integer, Integer> map) {
		System.out.println("\n\n===============Iterator===================");
		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	private static void iterateM2(Map<Integer, Integer> map) {
		System.out.println("\n\n===============entryset()===================");
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry);
		}
		
	}

	private static void iterateM1(Map<Integer, Integer> map) {
		System.out.println("\n\n===============KeySet()===================");
		for(int i:map.keySet()) {
			System.out.println("key : "+i+" Value : "+map.get(i));
		}
		
	}

}
