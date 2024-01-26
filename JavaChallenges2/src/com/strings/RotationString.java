package com.strings;

public class RotationString {

	public static void main(String[] args) {
		String str1 = "sunil";
		String str2 = "unils";
		
		String superString = str1 + str1;
		
		if(superString.contains(str2) && str1.length()==str2.length()) {
			System.out.println("rotation string");
		}
		else {
			System.out.println("not rotation string");
		}

	}

}
