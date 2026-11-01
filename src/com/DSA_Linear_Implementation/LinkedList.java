package com.DSA_Linear_Implementation;
public class LinkedList {
	Node head;
	int count=0;
	public void add(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			count++;
			return;
		}
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=n;
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object get(int index) {
		if(index<0||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=head;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public boolean contains(Object key) {
		Node curr=head;
		while(curr!=null) {
			if(curr.ele.equals(key)) {
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	public void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	public void addFirst(Object ele) {
		Node n=new Node(ele);
		n.next=head;
		head=n;
		count++;
	}
	public void removeFirst() {
		head=head.next;
		count--;
	}
	public void removeIndex(int index) {
		if(index<0||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			removeFirst();
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
}
