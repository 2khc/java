package com.kelvin.main;

public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.addNode(50, "Boss");
		tree.addNode(25, "Vice President");
		tree.addNode(65, "Office Manager");
		tree.addNode(14, "Secretary");
		tree.addNode(12, "Sales Manager");
		// tree.addNode(85,"Salesman 1");

		// tree.addNode(3, "noob");
		// tree.addNode(2, "noob2");

		// tree.inOrderTraverseTree(tree.root);
		// tree.postOrderTraverseTree(tree.root);
		// tree.preOrderTraverseTree(tree.root);

		//
		// System.out.println("\nNode with the key 75");
		// System.out.println(tree.findNode(75));

		// System.out.println(tree.getHeight(tree.root));
		System.out.println(tree.checkTreeBalance(tree.root));
	}
}
