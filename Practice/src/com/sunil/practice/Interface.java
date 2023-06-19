package com.sunil.practice;

 class RunMenthod implements Iterf1, Iterf2 {
		
	
	public void m1() {
		System.out.println("1");
	}
	public void m2(){
		System.out.println("2");
		 
	 }
	public void m3() {
		System.out.println("3");
		 
	 }
	public void m4() {
		System.out.println("4");
		 
	 }
	
	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("5");
		
	}
	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("6");
		
	}
	@Override
	public void m7() {
		// TODO Auto-generated method stub
		System.out.println("7");
		
	}
	@Override
	public void m8() {
		// TODO Auto-generated method stub
		System.out.println("8");
		
	}

}


public class Interface{
public static void main(String[] args) {
		

	
	RunMenthod i1=new RunMenthod();
	i1.m1();
}
}