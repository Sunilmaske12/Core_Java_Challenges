package pattern;

//1.*
//	*	*
//	*	*	*
//	*	*	*	*
	
//2.
//****
//****
//****
//****

//3.
//*****
//*   *
//*   *
//*****

//4. 
//****
//***
//**
//*


//5.            *
//	        *	*
//	    *   *   *
//	*	*	*	*

//6. 
//1
//12
//123
//1234
//12345

//7. 
//12345
//1234
//123
//12
//1

//8.
//1
//2 3
//4 5 6 
//7 8 9 10 
//11 12 13 14 15

//9.
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

//10.
//    *****
//   *****
//  *****
// *****
//*****

//11.
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5

//12.
//    1
//   212
//  32123
// 4321234
//543212345
public class Pattern {

	public static void main(String[] args) {
		System.out.println("1");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("2");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("3");
		//logic * print at end point whre i,j=1 or i,j=n
		for(int j=1; j<=4; j++) {
			for(int i=1; i<=5; i++) {
				if(i==1 || j==1 || i==5 || j==4) {
				System.out.print("*  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("4");
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("5");
		int row=4;
		for(int i=1; i<=row; i++) {
			for(int j=row-i; j>=1; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("6");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("7");
		int r=5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=r; j++) {
				System.out.print(j+" ");
			}
			r--;
			System.out.println();
		}
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("8");
		int eight=1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(eight+" ");
				eight++;
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("9");
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				if((i+j)%2==1) {
					System.out.print("0 ");
				}else {
					System.out.print("1 ");
					
				}
				
			}
			
			System.out.println();
		}
		
		

		System.out.println("\n\n==============================\n\n");
		System.out.println("10");
		int ten_row=5;
		for(int i=1; i<=ten_row; i++) {
			for(int j=i; j<ten_row; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=ten_row; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("11");
		int ele_row=5;
		for(int i=1; i<=ele_row; i++) {
			for(int j=i; j<ele_row; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n==============================\n\n");
		System.out.println("12");
		int twl_row=5;
		for(int i=1; i<=twl_row; i++) {
			for(int j=i; j<twl_row; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print(k);
			}
			for(int l=2; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
