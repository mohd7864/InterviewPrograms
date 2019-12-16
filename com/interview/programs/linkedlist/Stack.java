package com.interview.programs.linkedlist;

public class Stack {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
    public void push(int data) {
    	Node newNode = new Node(data);
    	newNode.next = head;
    	head = newNode;
    }
    
    public int pop() {
    	int data = head.data;
    	head = head.next;
    	return data;
    }
	
    public void print() {
    	Node curr = head;
    	while(curr!=null) {
    		System.out.println(curr.data);
    		curr = curr.next;
    	}
    }
    
    public static void main(String[] args) {
    	Stack st = new Stack();
    	st.push(1);
    	st.push(2);
    	st.push(3);
    	st.push(4);
    	
    	st.print();
    	
    	System.out.println("POP: "+st.pop());
    	System.out.println("POP: "+st.pop());
    	
    	st.print();
    }

}
