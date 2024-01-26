package com.strings;

public class ConsonentVoewelsNo {

	public static void main(String[] args) {
		String str = "hithisisjava";
		int voewels =0, consonent =0;
		for(char c:str.toLowerCase().toCharArray()) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				voewels++;
			}
			else if(c!=' ') {
				consonent++;
			}
		}
		System.out.println("voewels : "+voewels );
		System.out.println("consonent : "+consonent );

	}

}
