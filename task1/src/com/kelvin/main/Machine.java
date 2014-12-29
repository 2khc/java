package com.kelvin.main;

import java.util.Hashtable;

public class Machine {
	public static boolean checkUnique(String text) {
		StringBuffer str = new StringBuffer(text);
		int lengthOfString = str.length();
		boolean isTrue = true;
		Hashtable<Integer, String> stringOfCharacters = new Hashtable<Integer, String>(10, 10);

		for (int i = 0; i < lengthOfString; i++) {
			String character = new String(Character.toString(str.charAt(i)));
			stringOfCharacters.put(i, character);
		}

		for (int i = 0; i < lengthOfString; i++) {
			String singleCharacterString = new String(stringOfCharacters.get(i));

			System.out.println("reference letter: " + singleCharacterString.charAt(0));
			for (int x = i + 1; x < lengthOfString; x++) {
				System.out.println(stringOfCharacters.get(x).charAt(0));
				if (singleCharacterString.charAt(0) == stringOfCharacters.get(x).charAt(0)) {
					System.out.println("isTrue is set to false");
					isTrue = false;
				}
			}
		}
		return isTrue;
	}
}
