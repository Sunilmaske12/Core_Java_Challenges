package com.strings;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		
		String str = "sunilsunilsun";
		StringBuffer newStr=new StringBuffer();
		
		char[] charArr=str.toCharArray();
		
		Set<Character> setArr = new HashSet<Character>();
		
		for(char c:charArr) {
			setArr.add(c);
		}
		
		for(char c:setArr) {
			newStr.append(c);
		}
 		System.out.println(newStr);

	}

	

}
