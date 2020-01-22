package com.gul.java8;

public class LamdaExpression2 {

	private int operate(int a, int b, Function1 func) {
		return func.operation(a, b);
	}
	public static void main(String[] args) {
		Function1 func = (int x, int y)->x+y;
		
		LamdaExpression2 lmd = new LamdaExpression2();
		System.out.println("Addition of: "+lmd.operate(4, 6, func));
		
		Function2 func2 = (message->System.out.println("Welcome "+message));
		func2.sayMessage("Gulrez");
		
	}

	interface Function1 {
		int operation(int a, int b);
	}

	interface Function2 {
		void sayMessage(String message);
	}
}
