package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapInList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(42);
		list.add(52);
		list.add(62);
		Collections.swap(list, 0, 1);
		System.out.println(list);

	}

}
