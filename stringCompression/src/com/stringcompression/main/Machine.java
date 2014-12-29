package com.stringcompression.main;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	public static String compressString(String text) {
		int count = 1;
		String str = new String(text);

		List<String> compressedTextList = new ArrayList<String>(10);
		StringBuffer compressedTextString = new StringBuffer();

		for (int i = 0; i < str.length() - 1; i++) {

			if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1) ) {
				count++;
				String compressedSubstring = str.charAt(i) + Integer.toString(count);
				compressedTextList.add(compressedSubstring);
			} else {
				if (str.charAt(i) == str.charAt(i + 1)) {
					count++;
				} else {
					if (count < 2) {
						compressedTextList.add(Character.toString(str.charAt(i)));
						count = 1;
					} else {
						String compressedSubstring = str.charAt(i) + Integer.toString(count);
						compressedTextList.add(compressedSubstring);
						count = 1;
					}
				}
			}
			
			if (i == str.length() - 2){
				compressedTextList.add(Character.toString(str.charAt(i+1)));
			}
		}

		String myCompressedString = buildString(compressedTextList, compressedTextString);
		return myCompressedString;
	}

	private static String buildString(List<String> compressedTextList,
			StringBuffer compressedTextString) {
		// StringBuilder out = new StringBuilder();
		for (Object o : compressedTextList) {
			compressedTextString.append(o.toString());
			// compressedTextString.append("\t");
		}
		return compressedTextString.toString();
	}
	
	public static String returnShortestString(String text, String compressedText) {
		if (text.length() > compressedText.length()){
			return compressedText;
		} else {
			return text;
		}
	}
}