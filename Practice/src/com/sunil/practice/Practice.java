package com.sunil.practice;

public  class Practice extends A {
	
   public void demo() {
	   System.out.println("ovverride");
			
	}
	
 public String  m1(){
		 return "in m1";
	}
	
	public static void main(String[] args) {
		  int x;
		 for(x=2; x<=100; x++) {
			 
		 }
		System.out.println(x+" "+x);
		//Demo d=new Demo();
		Practice p=new Practice();
		p.demo();
		//String s=p.m1();
		System.out.println(p.m1());
		
	
	}

}
class Demo{
	
	public void demo(){
	System.out.println("in demo class");
	}
}

abstract class A{
	public abstract String m1();
	public void m2(){
		System.out.println("in A class");
		}
}