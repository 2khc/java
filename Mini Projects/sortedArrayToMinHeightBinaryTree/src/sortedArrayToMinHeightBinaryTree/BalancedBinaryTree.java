package sortedArrayToMinHeightBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

public class BalancedBinaryTree {
	Node root;
	boolean balance;
	LinkedList<Node> list = new LinkedList<Node>();
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	int key;

	public void unsortedAdd(SortedArray<Integer> sortedArray) {

	}

	public void add(SortedArray<Integer> sortedArray) {

		while (sortedArray.size() > 0) {
			// System.out.println(sortedArray);
			boolean helper = true;
			int depth = 0;
			int key = this.getKey(sortedArray);

			Node newNode = new Node(key);

			if (this.root == null) {
				this.root = newNode;
				this.root.setDepth(depth);
			} else {
				Node focusNode = this.root;
				Node parent;

				while (helper) {
					parent = focusNode;
					if (key < focusNode.key) {
						focusNode = focusNode.leftChild;
						depth++;
						if (focusNode == null) {
							parent.leftChild = newNode;
							parent.leftChild.setParent(parent);
							parent.leftChild.setDepth(depth);
							helper = false;
						}
					} else {
						depth++;
						focusNode = focusNode.rightChild;
						if (focusNode == null) {
							parent.rightChild = newNode;
							parent.rightChild.setParent(parent);
							parent.rightChild.setDepth(depth);
							helper = false;
						}
					}
				}
			}
		}
	}

	public ArrayList<LinkedList<Node>> depthToLinkedList() {
		Node focusNode = this.root;
		ArrayList<LinkedList<Node>> array = new ArrayList<LinkedList<Node>>();

		int height = getHeight(this.root);
		System.out.println(height);
		for (int i = 0; i < height; i++) {
			this.createDepthList(this.root, i);
			array.add(this.list);
			this.list = new LinkedList<Node>();
		}
		return array;
	}

	public void createDepthList(Node focusNode, int depth) {
		if (focusNode != null) {
			if (focusNode.depth == depth) {
				System.out.println("Something");
				this.list.add(focusNode);
			}
			System.out.println(focusNode);
			createDepthList(focusNode.leftChild, depth);
			createDepthList(focusNode.rightChild, depth);
		}
	}

	public boolean binarySearchCheck() {
		this.buildBinarySearchCheckList(this.root);
		for (int i = 1; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) < this.arrayList.get(i - 1)) {
				return false;
			}
		}
		this.arrayList = new ArrayList<Integer>();
		return true;
	}

	private void buildBinarySearchCheckList(Node focusNode) {

		if (this.root == null) {
			System.out.println("Tree is empty, will return true");

		}
		if (focusNode != null) {
			this.key = focusNode.key;
			buildBinarySearchCheckList(focusNode.leftChild);
			// if (focusNode.key < this.key) {
			// return false;
			// }
			this.arrayList.add(focusNode.key);
			buildBinarySearchCheckList(focusNode.rightChild);
		}
		System.out.println(this.arrayList);
	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			// Traverse left node
			inOrderTraverseTree(focusNode.leftChild);

			// Visit the current focussed node
			System.out.println(focusNode.key);

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
			System.out.println(focusNode.key);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode.key);
		}
	}

	public void createLinkedList(Node focusNode) {
		int height = this.getHeight(focusNode);

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

	public int getFirstCommonAncestor(int firstKey, int secondKey){
		
	}
	
	public Node getNextNode(int key) {
		Node focusNode = this.findNode(key);
		if (focusNode.rightChild == null) {
			return focusNode.parent;
		}

		if (focusNode.rightChild != null) {
			Node tempNode;
			tempNode = focusNode.rightChild;
			while (tempNode.leftChild != null) {
				focusNode = focusNode.leftChild;
				
				if (focusNode.rightChild.leftChild != null) {
					return focusNode.rightChild.leftChild;
				} else {
					return focusNode.rightChild;
				}
			}
		}

		return null;
	}

	private int getKey(SortedArray<Integer> sortedArray) {

		if (sortedArray.size() == 1) {
			int key = sortedArray.get(0);
			sortedArray.remove(0);
			// System.out.println(sortedArray.size());
			return key;
		} else {
			if (sortedArray.size() % 2 == 0) {
				int key = sortedArray.get(sortedArray.size() / 2);
				sortedArray.remove(sortedArray.size() / 2);
				return key;
			} else {
				int key = sortedArray.get((sortedArray.size() - 1) / 2);
				sortedArray.remove((sortedArray.size() - 1) / 2);
				return key;
			}

		}
	}
}
