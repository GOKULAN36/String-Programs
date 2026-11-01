package com.DSA_Linear_Implementation;

import java.util.EmptyStackException;

public class Stack1 {
	int count=0;
	Object[] o=new Object[10];
	 public int size() {
		 return count;
	 }
	 public void increase() {
			Object[] a=new Object[o.length+(o.length>>2)];
			for(int i=0;i<o.length;i++)a[i]=o[i];
			o=a;
		}
	 public boolean isEmpty() {
		 return count==0;
	 }
	 public void push(Object ele) {
		 if(count==o.length)increase();
		 o[count++]=ele;
	 }
	 public Object pop() {
		 if(count==0) 
				throw new EmptyStackException();
		Object key=o[count-1];
	 	o[count-1]=null;
	 	count--;
	 	return key;
	 }
	 public Object peek() {

			if(count==0) 
				throw new EmptyStackException();
		 return o[count-1];
	 }
}
