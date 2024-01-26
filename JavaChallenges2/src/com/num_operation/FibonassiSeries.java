package com.num_operation;

public class FibonassiSeries {

	public static void main(String[] args) {
		int n=10;
		int n1=0, n2=1;
		System.out.println(n1+"\n"+n2);
		for(int i=0; i<n; i++) {
			System.out.println(n1+n2);
			int temp = n2;
			n2 = n1+n2;
			n1 =temp;
		}

	}

}
