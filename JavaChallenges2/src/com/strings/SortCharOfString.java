package com.strings;

import java.util.Arrays;

public class SortCharOfString {

	public static void main(String[] args) {
		String str = "javaprogramming";
		char[] charArr = str.toCharArray();
		 Arrays.sort(charArr);
		 String sortedStr = new String(charArr);
		 System.out.println(sortedStr);
		 
	}

}
