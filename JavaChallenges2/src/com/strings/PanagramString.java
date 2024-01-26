package com.strings;

import java.util.HashSet;
import java.util.Set;

//panagram means string should contain all 26 character
public class PanagramString {

	public static void main(String[] args) {
		
		String str1 = "this is not a panagram string";
		String str2 = "The quick brown fox jumps over the lazy Dog";
		
		boolean panagramStr1 = checkPanagramMethod1(str1);
		boolean panagramStr2 = checkPanagramMethod1(str2);
		boolean panagramStr1M2 = checkPanagramMethod2(str1.toLowerCase());
		boolean panagramStr2M2 = checkPanagramMethod2(str2.toLowerCase());

	
		 if(panagramStr1) {
			 System.out.println("str1 : Panagram string");
		 }
		 else {
			 System.out.println("str1 : Not panagram");
		 }
		 if(panagramStr2) {
			 System.out.println("str2 : Panagram string");
		 }
		 else {
			 System.out.println("str2 : Not panagram");
		 }

		 if(panagramStr1M2) {
			 System.out.println("str1 : Panagram string");
		 }
		 else {
			 System.out.println("str1 : Not panagram");
		 }
		 if(panagramStr2M2) {
			 System.out.println("str2 : Panagram string");
		 }
		 else {
			 System.out.println("str2 : Not panagram");
		 }

	}

	private static boolean checkPanagramMethod2(String str) {
		if(str.length()<26) {
			return false;
		}else {
			for(char ch='a'; ch<='z'; ch++) {
				if(str.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkPanagramMethod1(String str) {
		Set<Character> allChar = new HashSet<Character>();
		
		 for(char c:str.toCharArray()) {
			allChar.add(Character.toLowerCase(c));
		 }
		
		 for(char c='a'; c<='z'; c++) {
			 if(!allChar.contains(c)) {
				return false;
			 }
		 }
		return true;
	}

}
