package com.sunil.practice;

import java.util.Scanner;

public class JavaChallenge2 {
	//print array indices whose numbers sum is your target
	//elements shoud not be repeted
	
	public static void main(String[] args) {
		int arr[]= {23,45,1,34,5,3,6,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int sum=sc.nextInt();
		sc.close();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("("+i+","+j+")");
				}
			}
			
		}
	}

}
