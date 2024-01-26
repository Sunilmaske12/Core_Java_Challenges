package com.strings;

import java.util.Stack;

//well formed means string should start and end with same bracket {}, [], (), {()},..........
public class WellFormedString {

	public static void main(String[] args) {
		
		String str = "{(sunil)}";
		
		Stack<Character> stack=new Stack<Character>();
		for(char c:str.toCharArray()) {
			if(stack.isEmpty()) {
				stack.push(c);
			}
			else if(c=='{' || c=='[' || c=='(') {
				stack.push(c);
			}
			else if(c==')' && stack.peek()=='(') {
				stack.pop();
			}else if(c==']' && stack.peek()=='[') {
				stack.pop();
			}else if(c=='}' && stack.peek()=='{') {
				stack.pop();
			}
			
		}
		if(stack.isEmpty()) {
			System.out.println("Well formed");
		}
		else {
			System.out.println("Not Well formed");
		}
	}

}
