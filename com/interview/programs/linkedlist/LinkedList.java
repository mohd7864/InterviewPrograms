package com.interview.programs.linkedlist;

public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	//Insert element at fisrt node
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	//delete element at first node
	public void deleteNode() {
		head = head.next;
	}
	//delete element at given node key
	public void deleteNode(int key) {
		Node curr = head;
		Node prev = null;
		if(curr!=null && curr.data==key) {
			this.deleteNode();
		}else {
			while(curr != null && curr.data != key) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
		}
	}
	//insert node at specifiec position
	public void insertNode(int pos, int data) {
		Node newNode = new Node(data);
		Node curr = head;
		Node prev = null;
		int count = 1;
		while(count < pos && curr!=null) {
			prev = curr;
			curr = curr.next;
			count++;
		}
		
		prev.next = newNode;
		newNode.next = curr;
	}
	//append  node at end
	public void append(int data) {
		Node newNode = new Node(data);
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	//printlist
	public void printList() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.printList();
		list.deleteNode(2);
		System.out.println();
		list.printList();
		list.insertNode(3, 5);
		System.out.println();
		list.printList();
	}

}
