package com.kelvin.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashTable<K, E> implements IMyHashTable<K, E> {
	List<List<E>> list;
	List<E> listInList;
	IHashFunction hashFunction;

	public MyHashTable(IHashFunction hashFunction, List<E> listInlist) {
		this.hashFunction = hashFunction;
		this.list = new ArrayList<List<E>>();
		this.listInList = new LinkedList<E>();
	}

	public void addValue(K key, E value) {
		int index = this.hashFunction.createHash(key);
		// collisionPreparation(index, key);
		if (index > list.size()) {
			List<E> emptyList = new ArrayList<E>();
			for (int i = list.size(); i < index; i++) {
				list.add(emptyList);
			}
			this.listInList = new LinkedList<E>();
			this.listInList.add(value);
			list.add(index, this.listInList);
		} else {
			if (list.get(index).indexOf(value) < 0){
				System.out.println("hi");
				System.out.println(list.get(index).indexOf(value));
				this.listInList = this.list.get(index);
				this.listInList.add(value);
				list.set(index, this.listInList);
			} else {
				System.out.println("else loop");
				this.listInList = new LinkedList<E>();
				this.listInList.add(value);
				list.add(index, this.listInList);
			}
			
		}
	}

	private void addToLinkedList(E value) {

	}

	public List<E> getValue(K key) {
		int index = this.hashFunction.createHash(key);
		this.listInList = list.get(index);
		return this.listInList;
	}
}
