package com.gul.java8;

import java.util.ArrayList;

public class LamdaExpression1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Aslam");
		al.add("Tabish");
		al.add("Firoz");
		al.forEach(n -> System.out.println(n));

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(5);
		al2.add(6);

		al2.forEach(n2 -> {
			if (n2 % 2 == 0) {
				System.out.println("no: " + n2);
			}
		});// even element using lambda expression
	}

}
