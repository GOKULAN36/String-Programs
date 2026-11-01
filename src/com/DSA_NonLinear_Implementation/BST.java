package com.DSA_NonLinear_Implementation;

public class BST {
	Node root;
	int count=0;
	boolean flag;
	public boolean add(int key) {
		flag=true;
		root=add(root,key);
		return flag;
	}
	public Node add (Node n,int key) {
		if(n==null) {
			Node a=new Node(key);
			count++;
			return a;
		}
		if(key<n.key) {
			n.left=add(n.left,key);
		}
		else if(key>n.key) {
			n.right=add(n.right,key);
		}
		else {
	        flag = false;   // duplicate
	    }

			return n;
	}
	public int size() {
		return count;
	}
	public void Pre_order(Node n) {
		if(n==null) {
			return;
		}
		System.out.println(n.key);
		Pre_order(n.left);
		Pre_order(n.right);
	}
	public void In_order(Node n) {
		if(n==null) {
			return;
		}
		In_order(n.left);
		System.out.println(n.key);
		In_order(n.right);
	}
	public void Post_order(Node n) {
		if(n==null) {
			return;
		}
		Post_order(n.left);
		Post_order(n.right);
		System.out.println(n.key);
	}
	public void Pre_order() {
		Pre_order(root);
	}
	public void In_order() {
		In_order(root);
	}
	public void Post_order() {
		Post_order(root);
	}
	public boolean contains(Node n,int key) {
		 if (n == null) {
		        return false;
		    }
		if(n.key==key) return true;
		if(key<n.key) {
			 return contains(n.left,key);
		}
			return contains(n.right,key);
	}
	public boolean contains(int key) {
	    return contains(root, key);
	}
	public int min(Node n) {
		int key=n.key;
		while(n.left!=null) {
			key=n.left.key;
			n=n.left;
		}
		return key;
	}
	public void remove (int key) {
		root= remove(root,key);
	}
	public Node remove(Node n,int key) {
		if(n==null) {
			return null;
		}
		if(key<n.key)
			n.left=remove(n.left,key);
		else if(key>n.key) 
			n.right=remove(n.right,key);
		else {
			if(n.right==null) {
				count--;
				return n.left;
			}
			else if(n.left==null) {
				count--;
				return n.right;
			}
			else {
				n.key=min(n.right);
				n.right=remove(n.right,n.key);
			}
		}
		return n;
	}
	
}
