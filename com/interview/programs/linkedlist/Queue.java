package com.interview.programs.linkedlist;


public class Queue {
	
Node head;
int front;
int rear;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
    public void enqueue(int data) {
    	Node newNode = new Node(data);
    	newNode.next = head;
    	head = newNode;
    	rear = head.data;
    }
    
    public int dequeue() {
       Node curr = head;
       Node prev = null;
       while(curr.next!=null) {
    	   prev = curr;
    	   curr = curr.next;
       }
       int data = curr.data;
       prev.next = null;
       front = prev.data;
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
    	Queue q = new Queue();
    	q.enqueue(1);
    	q.enqueue(2);
    	q.enqueue(3);
    	q.enqueue(4);
    	
    	q.print();
    	
    	System.out.println("Dequeue: "+q.dequeue());
    	
    	q.print();
    	
    	System.out.println("Front: "+q.front);
    	System.out.println("Rear: "+q.rear);
    }

}
