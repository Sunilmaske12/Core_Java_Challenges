package com.sunil.practice;

public class Practice2 extends Const{

	public Practice2() {
		
		System.out.println("in default");
		
	}
	public Practice2(int a) {
		super(3);
		System.out.println("in a");
	}
	public Practice2(int b, int c) {
		
		this();
		
		System.out.println("in bc");
		
	}
	public static void main(String[] args) {
		
		new Practice2(3, 4);
		
		
	}

}

class Const{
	Const(){
System.out.println("in super");
	}
	

		Const(int a){
	System.out.println("in A super");
		
}

}
