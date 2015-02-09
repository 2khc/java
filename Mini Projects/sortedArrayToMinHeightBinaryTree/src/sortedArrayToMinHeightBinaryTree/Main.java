package sortedArrayToMinHeightBinaryTree;

public class Main {
	public static void main(String[] args) {
		SortedArray<Integer> sortedArray = new SortedArray<Integer>();
		BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

		sortedArray.insertSorted(7);
		sortedArray.insertSorted(2);
		sortedArray.insertSorted(16);
		sortedArray.insertSorted(14);
		sortedArray.insertSorted(12);
		sortedArray.insertSorted(20);
		System.out.println(sortedArray);

		balancedBinaryTree.add(sortedArray);

		// System.out.println(balancedBinaryTree.depthToLinkedList());
		// System.out.println(balancedBinaryTree.root.key);

		// balancedBinaryTree.inOrderTraverseTree(balancedBinaryTree.root);
		//System.out.println(balancedBinaryTree.binarySearchCheck());
		// System.out.println(balancedBinaryTree.checkTreeBalance(balancedBinaryTree.root));
//		balancedBinaryTree.preOrderTraverseTree(balancedBinaryTree.root);
		System.out.println(balancedBinaryTree.getNextNode(14));
	}
}
