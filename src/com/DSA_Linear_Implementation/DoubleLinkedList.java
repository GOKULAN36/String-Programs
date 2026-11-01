package com.DSA_Linear_Implementation;

public class DoubleLinkedList {
	Node head;
	Node tail;
	int count=0;
	public void add(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			tail=n;
			count++;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=n;
		n.prev=curr;
		tail=n;
		count++;
	}
	public void addFirst(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			tail=n;
			count++;
			return;
		}
		n.next=head;
		head.prev=n;
		head=n;
		count++;
	}
	public void addLast(Object ele) {
		Node n=new Node(ele);
		if(tail == null) {
	        head = n;
	        tail = n;
	        count++;
	        return;
	    }
		n.prev=tail;
		tail.next=n;
		tail=n;
		count++;
	}
	public void addIndex(Object ele,int index) {
		if(index<0||index>size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			addFirst(ele);
			return;
		}
		if(index==size()) {
			addLast(ele);
			return;
		}
		
		Node curr=head;
		Node n=new Node(ele);
		for(int i=1;i<index;i++)
			curr=curr.next;
		n.next=curr.next;
		n.prev=curr;
		curr.next.prev=n;
		curr.next=n;
	
		count++;
		
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
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
	public void revDisplay() {
		Node curr=tail;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.prev;
		}
	}
	public void removeFirst() {
		if(head == null)
	        return;
		if(head==tail) {
			head=null;
			tail=null;
			return;
		}
		if(head!=null) {
			head=head.next;
			head.prev=null;
		}
	}
	public void removeLast() {
		if(tail== null)
	        return;
		if(head==tail) {
			head=null;
			tail=null;
			return;
		}
		if(tail!=null) {
			tail.prev=tail;
			head.next=null;
		}
		
	}
	public void remove(Object ele) {
	    Node curr = head;
	    while (curr!= null) {
	        if (curr.ele.equals(ele)) {
	            if (curr == head) {
	                head = curr.next;
	                if (head != null) {
	                    head.prev = null;
	                }
	            }
	            else if (curr == tail) {
	                tail = curr.prev;
	                tail.next = null;
	            }
	            else {
	                curr.prev.next = curr.next;
	                curr.next.prev = curr.prev;
	            }

	            return;
	        }
	        curr = curr.next;
	    }
	}
	
}
