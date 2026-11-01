package com.DSA_NonLinear_Implementation;

public class Node {
	Node left;
	int key;
	Node right;
	Node(int key){
		this.key=key;
	}
	public Node(Node left,Node right,int key) {
		this.left=left;
		this.right=right;
		this.key=key;
	}
}
