package com.strings;

public class AllSubstring {

	public static void main(String[] args) {
		String str = "abcd";
		
		
		for(int i=0; i<str.length(); i++) {
			String subStr = "";
			for(int j=i; j<str.length(); j++) {
				subStr+=str.charAt(j);
				System.out.println(subStr);
			}			
		}
		System.out.println("=================");
		
		//method 2
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				System.out.println(str.substring(i, j+1));
			}			
		}
	}
}
