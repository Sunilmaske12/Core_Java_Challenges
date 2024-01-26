package com.strings;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccuanceOfChar {

	public static void main(String[] args) {

		String str = "this is a java";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character s : str.toCharArray()) {
			Integer v = map.get(s);

			if (s != ' ') {
				if (v == null) {
					map.put(s, 1);
				} else {
					map.replace(s, v + 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}

	}

}
