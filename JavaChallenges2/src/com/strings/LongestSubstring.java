package com.strings;


//print longest substring without repeting
public class LongestSubstring {

	public static void main(String[] args) {
		
		String str = "aaabcdabcabcdefghabcd";
		String longestSubStr = "";
		
		
		for(int j=0; j<str.length(); j++) {			
			String currentSubStr ="";
			for(int i=j; i<str.length(); i++ ) {
				char currChar = str.charAt(i); 
				if(currentSubStr.indexOf(currChar)>=0) {
					
					break;
				}
				currentSubStr +=currChar;
				
			}
			
			if(currentSubStr.length()>longestSubStr.length()) {
				longestSubStr = currentSubStr;
			}
			System.out.println("Current str "+currentSubStr+" : "+currentSubStr.length());
		}
		
		System.out.println("Longest substring : "+longestSubStr);
		
	}

}
