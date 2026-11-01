package com.DSA_Linear_Implementation;
public class HashSet {
	Node[] a=new Node[10];
	int count=0;
	public boolean add(Object ele) {
		Node n=new Node(ele);
		int index=Math.abs(ele.hashCode()%a.length);
		if(a[index]==null) {
			a[index]=n;
			count++;
			return true;
		}
		Node temp=null;
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				return false;
			}
			temp=curr;
			curr=curr.next;	
		}
		temp.next=n;
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public boolean contains(Object ele) {
		int index=Math.abs(ele.hashCode()%a.length);
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.ele);
				curr=curr.next;
			}
		}
	}
	public boolean isEmpty() {
		return count==0;
	}
	public boolean remove(Object ele) {

		int index=Math.abs(ele.hashCode()%a.length);
		Node temp=null;
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				if(temp==null) {
					a[index]=curr.next;
					count--;
				}
				temp.next=temp.next.next;
				count--;
			}
			temp=curr;
			curr=curr.next;
		}
		return false;
	}
}
