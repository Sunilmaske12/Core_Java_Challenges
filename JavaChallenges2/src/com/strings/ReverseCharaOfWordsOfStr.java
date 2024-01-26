package com.strings;

public class ReverseCharaOfWordsOfStr {

	public static void main(String[] args) {
		
		String str = "Hello world";
				
		String result = "";
		
		for(String s:str.split(" ")) {
			for(int i=s.length()-1; i>=0; i--) {
				result +=s.charAt(i);
			}
			result+=" ";
		}		
		System.out.println(result);
	}
}
