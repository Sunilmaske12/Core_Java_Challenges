package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

//aaaabbbcdee ==> a4b3cde2
public class StringCompress {

	public static void main(String[] args) {
		
		String str = "aaaabbbcdee";
		String newStr ="";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c:str.toCharArray()) {
			if(map.get(c)==null) {
				map.put(c, 1);
			}else {
				map.replace(c, map.get(c)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				newStr = newStr + entry.getKey() + entry.getValue();
			}else {
				newStr += entry.getKey();
			}
		}
		
		System.out.println(newStr);
	}

}
