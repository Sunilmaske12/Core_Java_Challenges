package com.strings;
public class ReverseWords {

	//reverse word ==> this is a java ==> java a is this
	public static void main(String[] args) {
		String oldStr = "this is a java";
		StringBuffer sb=new StringBuffer();
		
		String[] strArr = oldStr.split(" ");
		
		for(String s:strArr) {
			sb.insert(0, s+" ");
		}
		System.out.println(sb);
	}
}
