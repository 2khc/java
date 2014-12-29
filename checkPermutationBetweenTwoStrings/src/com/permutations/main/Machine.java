package com.permutations.main;

import java.util.regex.Pattern;

public class Machine {
	public static boolean checkPermutation(String text1, String text2) {
		String str1 = new String(text1);
		String str2 = new String(text2);
		if (str1.length() == str2.length()) {

			for (int i = 0; i < str1.length(); i++) {

				char textOneCharacter = str1.charAt(i);
				String textOneCharacterString = Character.toString(textOneCharacter);

				// Replace first occurrence of character with blank.
				str2 = str2.replaceFirst(Pattern.quote(textOneCharacterString), "");
				System.out.println(str1.length());

				if (i + 1 == str1.length()) {
					if (str2.length() == 0) {
						return true;
					} else {
						return false;
					}
				}

			}

		} else {
			return false;
		}
		return true;
	}
}
