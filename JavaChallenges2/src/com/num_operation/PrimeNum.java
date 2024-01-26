package com.num_operation;

public class PrimeNum {

	public static void main(String[] args) {
		int num=2;
		
		boolean isPrime = true;
		
		if(num<2) {
			isPrime = false;
		}
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime number");
		}
		else  {
			System.out.println("Not Prime number");
		}

	}

}
