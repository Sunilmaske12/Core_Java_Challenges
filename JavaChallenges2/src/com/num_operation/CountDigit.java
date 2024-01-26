package com.num_operation;

public class CountDigit {

	public static void main(String[] args) {
		int num=12345;
		int digit=0;
		while(num>0) {
			num/=10;
			digit++;
		}
		System.out.println(digit);
		
		

	}

}
