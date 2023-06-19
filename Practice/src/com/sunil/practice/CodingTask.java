package com.sunil.practice;

//import java.util.Arrays;

public class CodingTask {
//2,3,5,7,11,..97
	public static void main(String[] args) {
		String s="i am aman";
		System.out.println(s);
		//s=s.replaceAll(" ", "");
		System.out.println(s);
		int count=0; 
		char a[]=s.toCharArray();
		for(char b:a) {
		if(b==' ') {
			count=count+1;
		}
		}
		System.out.println(count);
		
	}
	
}