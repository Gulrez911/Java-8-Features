package com.gul.test;

import java.util.Arrays;

public class EnumExample {
	public static void main(String[] args) {
		Color color = Color.RED;
		Color colors[] = Color.values();
		System.out.println(color);
		Arrays.stream(colors).forEach(val->System.out.println(val));
	}
}

enum Color {
	RED, BLUE, GREEN;
}
