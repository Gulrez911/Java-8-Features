package com.gul.java8;

import java.util.Scanner;

public class testClass {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		int i, num, fact = 1;
		System.out.print("Enter no");
		num = reader.nextInt();
		for (i = 1; i <= 2; i++) {
			fact = fact * i;
		}
		System.out.print(fact);
	}
}
