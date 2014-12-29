package com.kelvin.main;

public class Main {
	public static void main(String[] args) {
		String text = "helo";
		System.out.println("Hello World!");
		boolean isUnique = Machine.checkUnique(text);
		if (isUnique == true) {
			System.out.println(text + " contains unique characters");
		} else {
			System.out.println(text + " does not contain unique characters");
		}
	}
}
