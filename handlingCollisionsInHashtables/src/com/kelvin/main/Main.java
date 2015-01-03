package com.kelvin.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// String stringToHash = "hahaha";
		// int intToHash = 0;

		IHashFunction hashFunction = new HashFunction();
		List<String> listInList = new ArrayList<String>();
		IMyHashTable<String, String> hashtable = new MyHashTable<String, String>(hashFunction, listInList);
		hashtable.addValue("Entry", "in");
		hashtable.addValue("Kelvin", "Chan");
		hashtable.addValue("Dolan", "Miu");
		hashtable.addValue("Nicola", "Chan");
		hashtable.addValue("Kelvin", "Miu");
		hashtable.addValue("nivleK", "nahC");
		List<String> value = hashtable.getValue("Entry");
		System.out.println(value);
		value = hashtable.getValue("Kelvin");
		System.out.println(value);
		value = hashtable.getValue("Dolan");
		System.out.println(value);
		value = hashtable.getValue("Nicola");

		System.out.println(value);
	}
}
