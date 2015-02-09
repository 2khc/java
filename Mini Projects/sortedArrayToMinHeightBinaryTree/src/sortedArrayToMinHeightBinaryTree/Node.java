package sortedArrayToMinHeightBinaryTree;

public class Node {
	int key;
	String name;

	Node leftChild;
	Node rightChild;
	Node parent;

	int depth;

	Node(int key) {
		this.key = key;
		// this.name = name;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	// public String toString() {
	// return this.name + " has the key " + this.key;
	// }
}
