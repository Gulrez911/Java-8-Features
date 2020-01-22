package com.gul.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Gulrez", "Farooqui", 25),
				new Person("Surkhab", "Farooqui", 22), new Person("Shadab", "Farooqui", 30));
		list.stream().filter(p->p.getLastName().startsWith("F")).forEach(p -> System.out.println(p.getFirstName()));
	}
}
