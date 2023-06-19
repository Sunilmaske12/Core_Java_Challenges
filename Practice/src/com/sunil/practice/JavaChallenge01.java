package com.sunil.practice;

public class JavaChallenge01 {
	//printing numbers from 1 to 100, each nummber on next line
	//instead of multiple of 3 print Fizz
	//instead of multiple of 5 print Buzz
	//instead of multiple of 3 and 5 print FizzBuzz
	void number() {
		for(int i=1; i<=100; i++) {
			if(i%3==0 & i%5==0) {
				System.out.print("FizzBuzz \n");	
			}else if(i%3==0) {
				System.out.print("FIzz \n");
			}else if(i%5==0) {
				System.out.print("Buzz \n");	
			} else
			System.out.print(i+"\n");
		}
	}
	
	public static void main(String[] args) {
		JavaChallenge01 jc=new JavaChallenge01();
		jc.number();
		
	}

}
