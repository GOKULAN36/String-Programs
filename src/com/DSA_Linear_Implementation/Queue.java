package com.DSA_Linear_Implementation;
public class Queue {
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
		 public void add(Object ele) {
			 if(count==o.length)increase();
			 o[count++]=ele;
		 }
		 public Object poll() {
			Object key=o[0];
		 	for(int i=1;i<=count;i++) {
		 		o[i-1]=o[i];
		 	}
		 	return key;
		 }
		 public Object peek() {
			 return o[0];
		 }
}
