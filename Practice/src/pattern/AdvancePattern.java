package pattern;

public class AdvancePattern {

//1. *      *
//   **    **
//   ***  ***
//   ********
//   ***  ***
//   **    **
//   *      *
	
//2.     *****
//      *****
//     *****
//    *****
//   *****
	
//3.   1
//	2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

//4.       *
//	     * * *
//	   * * * * *
//	 * * * * * * *
//	 * * * * * * *
//	   * * * * *
//	     * * *
//	       *
	  
	public static void main(String[] args) {
		System.out.println("1");
		int s=6;
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			for(int c=1; c<=s; c++) {
				System.out.print(" ");
			}
			s=s-2;
			for(int d=1; d<=a; d++) {
				System.out.print("*");
			}
			System.out.println();

		}
		int t=0;
		for(int a=1; a<=4; a++) {
			for(int b=4; b>=a; b--) {
				System.out.print("*");
			}
			for(int c=1; c<=t; c++) {
				System.out.print(" ");
			}
			t=t+2;
			for(int d=4; d>=a; d--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n=====================  2  ================\n");
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n=====================  3  ================\n");
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n=====================  4  ================\n");
		//this is not best practice because entire program not depend on single variable
		int c=1,c1=7;
		for(int i=1; i<=4; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=c; k++) {
				System.out.print("*");
			}
			c=c+2;
			System.out.println();
		}
		
		for(int l=1; l<=4; l++) {
			for(int m=1; m<l; m++) {
				System.out.print(" ");
			}
			for(int n=1; n<=c1; n++) {
				System.out.print("*");
			}
			c1 = c1-2;
			System.out.println();
		}
		
		
		//best practice
		int row = 4;
		for(int i=1; i<=row; i++) {
			for(int j=row; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row; i>=1; i--) {
			for(int j=row; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
