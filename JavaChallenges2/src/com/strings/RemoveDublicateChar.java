package com.strings;

public class RemoveDublicateChar {

	public static void main(String[] args) {
		String s1="abcdabcdefghghd";
		StringBuffer sb=new StringBuffer();
		
		for(char c:s1.toCharArray()) {
			//System.out.println(s1.indexOf(c));
			if(sb.toString().indexOf((c))<0) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
	
}
