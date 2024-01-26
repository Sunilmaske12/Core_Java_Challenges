package com.num_operation;

public class FirstDigitLastDigitSumOfThem {

	public static void main(String[] args) {

		int num = 12345;
		int ld = num%10;
		int fd=0;
		int tempNum = num;
		while(tempNum>0) {
			fd = tempNum;
			tempNum /=10; 
		}
		System.out.println("First "+fd);
		System.out.println("Last "+ld);
		System.out.println("Sum "+(fd+ld));

	}

}
