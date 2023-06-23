package loops;

import java.util.Scanner;

public class Loops {
	 

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
	//average of 3 number
		// avg(sc);
		 
	//sum of n odd number
		// oddSum(sc);
		 
		// greater number
		// gre(sc);
		 
		//circumfernce of circle
		// circum(sc);
		 
		 //print person is eligible for vote or note
		// vote(sc);
		 
		 //infinite loop using doWhile condition
		// infiniteLoop();
		 
		 //user take input as he want and print count of positive, negative, zero
		// countNPZ(sc);
		 
		 
		 //take 2 no x,y print x power y
		// pow(sc);
		 
		 //Greatest common divisor of 2 number
		// GCD(sc);
		 
		 //fibonacci series of n terms
		 //fibb(sc);
		 
		 sc.close();
		
	}
	
	 static void fibb(Scanner sc) {
		 System.out.println("enter limit");
			int x = sc.nextInt();
			int n1 = 0; 
			int n2 = 1;
			int sum = 0;
			System.out.print(n1+" "+n2+" ");
			for(int i=1; i<=x-2; i++) {
				sum = n1 +n2;
				n1 = n2; 
				n2 = sum;
				System.out.print(sum+" ");
			}
			
		
	}

	public static void GCD(Scanner sc) {
		System.out.println("enter 2 numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i=x; i>=1; i--) {
			if(x%i==0) {
				if(y%i==0) {
					System.out.println("GCD :"+i);
					break;
				}
			}
		}
		
	}

	public static void pow(Scanner sc) {
		System.out.println("enter x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(Math.pow(x, y));
		
	}

	public static void countNPZ(Scanner sc) {
		String print;
		int countP=0, countN=0, countZ = 0;
		int i;
		for( i=0; ; i++) {
			System.out.println("Enter number or Enter 'yes' for end" );
			print = sc.next();
			if(print.equals("yes")) break;
			int p = Integer.parseInt(print);
			if(p == 0) countZ++;
			if(p >= 0) countP++;
			if(p <= 0) countN++;
		}
		System.out.println("Positive :"+countP+ " \n Negative :"+countN+"\n Zero "+countZ);
		System.out.println("Total :"+i);

		
	}

	public static void infiniteLoop() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i>0);
		
	}

	public static void vote(Scanner sc) {
		System.out.println("enetr age");
		 int a = sc.nextInt();
		 if(a>=18) {
			System.out.println("you are eligible"); 
		 } else 			System.out.println("you are not eligible"); 

	}

	public static void circum(Scanner sc) {
		System.out.println("enetr r");
		 int a = sc.nextInt();
		 System.out.println(2*3.14*a);
	}

	public static  void avg(Scanner sc) {
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		float avg =  (float)(a+b+c)/3;
		System.out.println(avg);
	}
	
	public static  void oddSum(Scanner sc) {
		 int a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=a; i++) {
			if(i%2!=0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	public static  void gre(Scanner sc) {
		System.out.println("enter 2 no");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 if(a>b) {
		 System.out.println("greater :"+a );
		 } else {
			 System.out.println("greater :" +b);
 
		 }
	}
	

}
