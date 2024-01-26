package com.strings;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		//method 1
		String str1 = "abcba";		
		boolean isPalindrome1 = true;
		for(int i=0; i<(str1.length()/2); i++) {
			if(str1.charAt(i)!=str1.charAt(str1.length()-1-i)) {
				isPalindrome1 = false;
				break;
			}
		}
		if(isPalindrome1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		//method 2
		String str2 = "abcdeedcba";
		String revStr2 = "";
		for(char c:str2.toCharArray()) {
			revStr2 = c + revStr2;
		}
		if(str2.equals(revStr2)) {
			System.out.println("palindrome");
		}

	}

}
