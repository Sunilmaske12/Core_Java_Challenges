package com.num_operation;

public class LargestOf3num {

	public static void main(String[] args) {
		int n1=10, n2=20, n3=13;
		
		if(n1>n2 && n1>n3) {
			System.out.println("Largest : "+n1);
		}
		else if(n2>n3) {
			System.out.println("Largest : "+n2);
			
		}
		else {
			System.out.println("Largest : "+n3);
			
		}

	}

}
