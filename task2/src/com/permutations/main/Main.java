package com.permutations.main;

public class Main {
	public static void main(String[] args) {
		String text1 = "qwe1234";
		String text2 = "123qwew";

		boolean isPermutation = Machine.checkPermutation(text1, text2);

		if (isPermutation == true) {
			System.out.println(text1 + " is a permutation of " + text2);
		} else {
			System.out.println(text1 + " is not a permutation of " + text2);
		}
	}
}
