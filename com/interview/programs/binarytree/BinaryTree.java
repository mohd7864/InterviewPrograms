package com.interview.programs.binarytree;

public class BinaryTree {
	
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			this.data = d;
			left = right = null;
		}
	}
	
	public void inOrder(Node temp) {
		if(temp==null) {
			return;
		}
		inOrder(temp.left);
		System.out.println(temp.data);
		inOrder(temp.right);
		
	}
	
	public void preOrder(Node temp) {
		if(temp==null) {
			return;
		}
		System.out.println(temp.data);
		preOrder(temp.left);
		preOrder(temp.right);
		
	}
	
	public void postOrder(Node temp) {
		if(temp==null) {
			return;
		}
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.println(temp.data);
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		System.out.println("Inorder: ");
		tree.inOrder(tree.root);
		System.out.println("preorder: ");
		tree.preOrder(tree.root);
		System.out.println("postorder: ");
		tree.postOrder(tree.root);
	}

}
