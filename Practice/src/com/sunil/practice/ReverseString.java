package com.sunil.practice;

public class ReverseString {
	 //2 ways=>API(string builder) and manually
	public static void main(String[] args) {
		String str="SUNIL";
		
		
		//Manually
		String nStr="";
		for(int i=str.length()-1; i>=0; i--) {
			nStr=nStr+str.charAt(i);
		}
		System.out.println(nStr);
	}

}
