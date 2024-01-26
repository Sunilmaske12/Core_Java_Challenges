package com.strings;


public class EvenLengthWordInString {

	public static void main(String[] args) {
		
		String str = "This    is a programe for printing even length word in a string";
		
		String[] strArr = str.split(" +");
		
		for(String s:strArr) {
			if(s.length()%2==0) {
				System.out.println(s+" : "+s.length());
			}
		}

	}

}
