package com.kelvin.main;

public class HashFunction implements IHashFunction {

	public int createHash(Object x) {
		int hash = globalHash(x);
		return hash;
	}

	private int globalHash(Object x) {
		int code = 0;
		char character;
		String y = x.toString();
		for (int i = 0; i < y.length(); i++) {
			character = y.charAt(i);
			code += ((int) character * 3) / 2;
		}
		return code;
	}
}
