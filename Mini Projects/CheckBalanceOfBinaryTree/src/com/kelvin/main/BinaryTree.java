package com.kelvin.main;

public class BinaryTree {
	Node root;

	int leftHeight;
	int rightHeight;
	int treeHeight;
	boolean balance;

	public BinaryTree() {
		this.leftHeight = 0;
		this.rightHeight = 0;
	}

	public void addNode(int key, String name) {

		// Create a new node and initialise

		Node newNode = new Node(key, name);

		if (this.root == null) {
			this.root = newNode;

		} else {
			Node focusNode = root;

			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {
					focusNode = focusNode.rightChild;

					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}

				}
			}

		}

	}

	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			// Traverse left node
			inOrderTraverseTree(focusNode.leftChild);

			// Visit the current focussed node
			System.out.println(focusNode);

			// Traverse right node
			inOrderTraverseTree(focusNode.rightChild);
		}
	}

	public boolean checkTreeBalance(Node focusNode) {
		if (focusNode == null) {
			return true;
		}

		if (this.root == null) {
			System.out.println("tree is empty");
			return true;
		}

		if (focusNode != null) {
			balance = checkTreeBalance(focusNode.leftChild) && checkTreeBalance(focusNode.rightChild);

		}
		return balance && Math.abs(getHeight(focusNode.leftChild) - getHeight(focusNode.rightChild)) <= 1;

	}

	public int getHeight(Node focusNode) {
		if (focusNode == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(focusNode.leftChild), getHeight(focusNode.rightChild));
		}

	}

	public void preOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);
		}
	}

	public Node findNode(int key) {
		// Start at the top of the tree
		Node focusNode = this.root;

		// While node has not been found keep looking
		while (focusNode.key != key) {
			// If we should
			if (key < focusNode.key) {
				// shift focus to the left child
				focusNode = focusNode.leftChild;
			} else {
				// Shift focus to the right child
				focusNode = focusNode.rightChild;
			}

			if (focusNode == null) {
				return null;
			}
		}
		return focusNode;
	}

}
