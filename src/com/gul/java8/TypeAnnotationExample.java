package com.gul.java8;

public class TypeAnnotationExample {
	public static void main(String[] args) {
		B b = new B();
		b.showDatabase();
	}
}
class A{
	
	public void showDatabase() {
		System.out.println("In A");
	}
}
class B extends A{
	
	@Override
	public void showDatabase() {
		System.out.println("In B");
	}
}