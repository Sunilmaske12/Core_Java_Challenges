package com.strings;

public class FirstLetterOfWord {

	public static void main(String[] args) {
		String str = "this is a program to print first letter of a word";
		String[] strArr = str.split(" +");
		for(String s:strArr) {
			System.out.println(s.charAt(0));
		}
		
	}

}
