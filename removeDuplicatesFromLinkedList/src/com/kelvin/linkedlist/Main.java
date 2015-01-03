package com.kelvin.linkedlist;

public class Main {
	public static void main(String[] args) {
		KelvinLinkedList list = new KelvinLinkedList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("5");
		list.add("3");
		list.add("1");
		System.out.println("lList - print linkedlist: " + list);
		System.out.println("lList.size() - print linkedlist size: " + list.size());
		System.out.println("lList.get(3) - get 3rd element: " + list.get(3));
		System.out.println("lList.remove(2) - remove 2nd element: " + list.remove(2));
		System.out.println("lList.get(3) - get 3rd element: " + list.get(3));
		System.out.println("lList.size() - print linkedlist size: " + list.size());
		System.out.println("lList - print linkedlist: " + list);
		System.out.println(list);
		
		list.removeDuplicate();
		System.out.println(list);
		list.removeDuplicate();
		System.out.println(list);
		list.removeDuplicate();
		System.out.println(list);
		
	}
}
