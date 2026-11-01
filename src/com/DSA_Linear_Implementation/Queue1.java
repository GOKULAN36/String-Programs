package com.DSA_Linear_Implementation;

public class Queue1 {
	Node first;
	int count=0;
	public void add(Object ele) {
		Node n=new Node(ele);
		if(first==null) {
			first=n;
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) 
			curr=curr.next;
		curr.next=n;
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		return first.ele;
	}
	public Object poll() {
		Object key=first.ele;
		first=first.next;
		count--;
		return key;
	}
}
