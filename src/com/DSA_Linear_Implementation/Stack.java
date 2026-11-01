package com.DSA_Linear_Implementation;

import java.util.EmptyStackException;

public class Stack {
	Node first;
	int count=0;
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		if(first==null) {
			throw new EmptyStackException();
		}
		Object key=first.ele;
		return key;
	}
	public Object pop() {
		if(first==null) {
			throw new EmptyStackException();
		}
		Object key=first.ele;
		first=first.next;
		return key;
	}
	public void push(Object ele) {
		Node n=new Node(ele);
		if(first==null) {
			first=n;
			count++;
			return;
		}
		n.next=first;
		first=n;
		count++;
	}
}
