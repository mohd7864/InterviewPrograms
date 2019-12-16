package com.interview.programs.linkedlist;

public class MergeSort {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// Insert element at fisrt node
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// delete element at first node
	public void deleteNode() {
		head = head.next;
	}

	// delete element at given node key
	public void deleteNode(int key) {
		Node curr = head;
		Node prev = null;
		if (curr != null && curr.data == key) {
			this.deleteNode();
		} else {
			while (curr != null && curr.data != key) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
		}
	}

	// insert node at specifiec position
	public void insertNode(int pos, int data) {
		Node newNode = new Node(data);
		Node curr = head;
		Node prev = null;
		int count = 1;
		while (count < pos && curr != null) {
			prev = curr;
			curr = curr.next;
			count++;
		}

		prev.next = newNode;
		newNode.next = curr;
	}

	// append node at end
	public void append(int data) {
		Node newNode = new Node(data);
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public Node sort(Node curr) {
		if(curr == null || curr.next == null) {
			return curr;
		}
		Node mid = getMiddle(curr);
		Node nextNode = mid.next;
		
		mid.next = null;
		
		Node l = sort(curr);
		Node r = sort(nextNode);
		
		Node list = mergeSort(l,r);
		return list;
	}
	
	public Node mergeSort(Node l, Node r) {
		Node res = null;
		if(l == null) {
			return r;
		}
		if(r == null) {
			return l;
		}
		
		if(l.data <= r.data) {
			res = l;
			res.next = mergeSort(l.next, r);
		}else {
			res = r;
			res.next = mergeSort(l,r.next);
		}
		return res;
	}
	
	public Node getMiddle(Node temp) {
		Node slow = temp;
		Node fast = temp;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
		
	}

	// printlist
	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}

	}
	
	public void printList(Node curr) {
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		MergeSort list = new MergeSort();
		list.push(15);
		list.push(10);
		list.push(5);
		list.push(20);
		list.push(3);
		list.push(2);
		list.head = list.sort(list.head);
		list.printList(list.head);
	}

}
