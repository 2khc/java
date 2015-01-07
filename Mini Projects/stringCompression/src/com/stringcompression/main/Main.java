package com.stringcompression.main;

public class Main {
	public static void main (String[] args){
		String text = "aabbccrrrrrgr";
		
		String compressedText = Machine.compressString(text);
		String finalString = Machine.returnShortestString(text, compressedText);
		System.out.println(finalString);
	}
}
