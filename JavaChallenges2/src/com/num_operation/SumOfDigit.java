package com.num_operation;

public class SumOfDigit {

	public static void main(String[] args) {

		int num =12345;
		int sum = 0;
		while(num>0) {
			int ld = num%10;
			num /=10;
			sum+=ld;
		}
		System.out.println(sum);

	}

}
