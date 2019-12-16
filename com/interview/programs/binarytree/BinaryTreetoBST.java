package com.interview.programs.binarytree;

import com.interview.programs.sort.HeapSort;

public class BinaryTreetoBST {

	Node root;
	int i=0;

	static class Node {
		int data;
		Node left, right;

		Node(int d) {
			this.data = d;
			left = right = null;
		}
	}

	public void inOrder(Node temp) {
		if (temp == null) {
			return;
		}
		inOrder(temp.left);
		System.out.println(temp.data);
		inOrder(temp.right);

	}

	public void preOrder(Node temp) {
		if (temp == null) {
			return;
		}
		System.out.println(temp.data);
		preOrder(temp.left);
		preOrder(temp.right);

	}

	public void postOrder(Node temp) {
		if (temp == null) {
			return;
		}
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.println(temp.data);

	}

	public int count(Node temp) {
		if (temp == null) {
			return 0;
		}
		return 1 + count(temp.left) + count(temp.right);
	}

	public void binaryToBST(Node temp) {
		int n = this.count(temp);
		int[] arr = new int[n];
		traverseInorder(temp, arr);
		HeapSort h = new HeapSort();
		h.sort(arr);
		this.i=0;
		convertToBST(arr,temp);
		//this.inOrder(temp);
	}
	
	public void convertToBST(int[] arr,Node temp) {
		if(temp==null) {
			return;
		}
		convertToBST(arr, temp.left);
		temp.data = arr[i];
		i++;
		convertToBST(arr, temp.right);
		this.inOrder(temp);
	}

	public void traverseInorder(Node temp, int[] arr) {
		if (temp == null) {
			return;
		}
		traverseInorder(temp.left, arr);
		arr[i] = temp.data;
		i++;
		traverseInorder(temp.right, arr);
	}

	public static void main(String[] args) {
		BinaryTreetoBST tree = new BinaryTreetoBST();
		tree.root = new Node(10);
		tree.root.left = new Node(30);
		tree.root.right = new Node(15);
		tree.root.left.left = new Node(20);
		tree.root.right.right = new Node(5);
		System.out.println("Inorder: ");
		tree.inOrder(tree.root);
		System.out.println("preorder: ");
		tree.preOrder(tree.root);
		System.out.println("postorder: ");
		tree.postOrder(tree.root);
		tree.binaryToBST(tree.root);
	}

}
