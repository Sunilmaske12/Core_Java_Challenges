package com.num_operation;

public class ReverseDigit {

	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0;
		
		while(num>0) {
			int ld = num%10;
			reverse = reverse*10 + ld;
			num /=10;
		}
		
		System.out.println(reverse);

	}

}
