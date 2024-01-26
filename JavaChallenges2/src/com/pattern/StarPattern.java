package com.pattern;



public class StarPattern {

	public static void main(String[] args) {
		
		//*****
		//*****
		//*****
		//*****
		//*****
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		System.out.println("\n\n=======================");
		int num=1;
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		//12345
		//1234
		//123
		//12
		//1
		System.out.println("\n\n=======================");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
