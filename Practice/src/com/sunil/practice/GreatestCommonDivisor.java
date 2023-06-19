package com.sunil.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nummbers");
		int n1=sc.nextInt(), n2=sc.nextInt();		
		int gcd=1;
		for(int i=1; i<=n1; i++) {
			
			if(n1%i==0 && n2%i==0) {
			gcd=i;	
			}
		}
		System.out.println(gcd);
		sc.close();
	}

}
