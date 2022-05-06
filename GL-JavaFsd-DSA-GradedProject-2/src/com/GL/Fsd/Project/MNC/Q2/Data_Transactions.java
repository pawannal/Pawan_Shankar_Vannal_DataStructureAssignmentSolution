package com.GL.Fsd.Project.MNC.Q2;

public class Data_Transactions {

	public static node node;
	static node prevNode = null;
	static node headNode = null;

	static void flattenBTToSkewed(node root, int order) {

		if (root == null) {
			return;
		}

		if (order > 0) {
			flattenBTToSkewed(root.right, order);
		} else {
			flattenBTToSkewed(root.left, order);
		}
		node rightNode = root.right;
		node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			flattenBTToSkewed(leftNode, order);
		} else {
			flattenBTToSkewed(rightNode, order);
		}
	}

	static void traverseRightSkewed(node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	// Driver Code
	public static void main(String[] args) {

		Data_Transactions.node = new node(50);
		Data_Transactions.node.left = new node(30);
		Data_Transactions.node.right = new node(60);
		Data_Transactions.node.left.left = new node(10);
		Data_Transactions.node.right.left = new node(55);
		System.out.print("Skewed Tree is -> ");
		int order = 0;
		flattenBTToSkewed(node, order);
		traverseRightSkewed(headNode);
	}

}
