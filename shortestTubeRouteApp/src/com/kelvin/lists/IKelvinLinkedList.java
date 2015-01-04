package com.kelvin.lists;

public interface IKelvinLinkedList {
	void add(Object data);

	void add(Object data, int index);

	Object get(int index);

	boolean remove(int index);

	int size();

	String toString();

	void removeDuplicate();

	boolean removeFromEnd(int i);
}
