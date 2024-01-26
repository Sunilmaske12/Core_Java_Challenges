package com.strings;

import java.util.Map;
import java.util.TreeMap;

public class PrintNoOfWordsVoewelsUppercaseFrequencyOfChar {
	
	static String str = "Learn JAVA With Sunil";

	public static void main(String[] args) {
		
		int uppercase = getUpperCase();
		int words = getWords();
		int voewels = getNoOfVoewels();
		pringFrequencyOfChar();
		
		System.out.println("uppercase : "+uppercase);
		System.out.println("words : "+words);
		System.out.println("voewels : "+voewels);
		
	}

	private static void pringFrequencyOfChar() {
		TreeMap<Character, Integer> map=new TreeMap<Character, Integer>();
		for(char c:str.toCharArray()) {
			if(c!=' ') {
				Integer value = (Integer) map.get(c);
				if(value==null) {
					map.put(c, 1);
				}else {
					map.replace(c, ++value);
				}
			}
		}
		
		for(Map.Entry<Character, Integer> e: map.entrySet()) {
			System.out.println("frequency : "+e.getKey()+" : "+e.getValue());
		}
		
	}

	private static int getNoOfVoewels() {
		int voewels = 0;
		
		for(char c : str.toLowerCase().toCharArray()) {
			switch(c) {
			case 'a' : case 'e': case 'i': case 'u': case 'o' : voewels++;
			}
		}	
		return voewels;
	}

	private static int getWords() {
		String[] strArr = str.split(" +");
		return strArr.length;
	}

	private static int getUpperCase() {
		int upperCase = 0;
		
		for(char c : str.toCharArray()) {
			if(c>=65 && c<=90 )
				upperCase++;		
		}
		return upperCase;
	}

}
