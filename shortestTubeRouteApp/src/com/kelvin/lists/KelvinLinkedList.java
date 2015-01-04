package com.kelvin.lists;

import java.util.ArrayList;
import java.util.List;

public class KelvinLinkedList implements IKelvinLinkedList {

	private Node head;
	private int listCount;

	public KelvinLinkedList() {
		head = new Node(null);
		listCount = 0;
	}

	public void add(Object data) {
		Node temp = new Node(data);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(temp);

		this.listCount++;
	}

	public void add(Object data, int index) {
		Node temp = new Node(data);
		Node current = head;

		for (int i = 1; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}

		temp.setNext(current.getNext());
		current.setNext(temp);
		this.listCount++;
	}

	public Object get(int index) {
		if (index <= 0) {
			return null;
		}

		Node current = head.getNext();
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(int index) {
		if (index < 1 || index > size()) {
			return false;
		}

		Node current = head;
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null) {
				return false;
			}
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--;
		return true;
	}

	public int size() {
		return listCount;
	}

	public String toString() {
		Node current = head.getNext();
		String output = "";
		while (current != null) {
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}

	public void removeDuplicate() {
		Node temp = head;
		Node current = head;
		// int i = 1;
		Object tempData;
		for (int i = 1; i < size(); i++) {

			temp = temp.getNext();
			current = temp.getNext();
			tempData = temp.getData();
			while (current != null) {
				if (tempData == current.getData()) {

					remove(i);
					temp = temp.getNext();
					current = temp.getNext();
					tempData = temp.getData();
				} else {

					current = current.getNext();
				}
			}
		}
	}

	public boolean removeFromEnd(int i) {
		int index = size() - i;
		remove(index);
		return true;
	}

	private class Node {
		List<Node> next = new ArrayList<Node>();
		List<Node> previous = new ArrayList<Node>();
		Object data;

		public Node(Object dataValue) {
			this.next = null;
			this.previous = null;
			this.data = dataValue;
		}

		public Node(Object dataValue, List<Node> nextValue) {
			this.next = nextValue;
			this.data = dataValue;
		}

		public Object getData() {
			return this.data;
		}

		public void setData(Object dataValue) {
			this.data = dataValue;
		}

		public List<Node> getNext() {
			return this.next;
		}
		
		public List<Node> getPrevious() {
			return this.previous;
		}

		public void setNext(Node nextValue) {
			this.next.add(nextValue);
		}
	}

}
