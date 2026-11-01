package com.Arrays;

import java.util.Arrays;

public class Searching_Sorting {

	public static void main(String[] args) {
		int[] a= {1,2,3,7,10,20,30,50,70};
		int res1=BinarySearch(a,30);
		System.out.println("BinarySearch   "+res1);
		
		System.out.println("BinarySearchRecursive  ->"+BinarySearchRecursive(a, 30, 0, a.length-1)+"\n");
		
		int[] arr= {9,8,7,6,5,4,3,2,1};
		BubbleSort(arr);
		BubbleSort1(arr);
		
		int[] c= {1,9,8,8,3,4,2,1,0,0,7};
		sort(c);
		System.out.println("Merger sort "+Arrays.toString(c));
		System.out.println("_____________________________________________________________");
		
		int[] d= {1,9,8,8,3,4,2,1,0,0,7};
		QuickSort(d,0,d.length-1);
		System.out.print("QuickSort  ");
		System.out.println(Arrays.toString(d));
		int[] arr1= {2,4,3,5,7,9,15,19};
		int res=RecursiveLinearSearch(arr1, 5, arr1.length-1);
		System.out.println(res);
		int res2=RecursiveBinarySearch(arr1,5, 0, arr1.length-1);
		System.out.println(res2);
		RecursiveBubbleSort(arr1,0,arr1.length);
		System.out.println(Arrays.toString(arr1));
		
	}
	private static String BinarySearchRecursive(int[] a, int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
	public static int RecursiveLinearSearch(int[] a,int val,int idx) {
		if(idx<0) {
			return -1;
		}
		if(a[idx]==val) {
			return idx;
		}
		return RecursiveLinearSearch(a,val,idx-1);
	}

	public static int BinarySearch(int[] a,int key) {
		int st=0,end=a.length-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(key==a[mid]) {
				return mid;
			}
			if(key<a[mid]) {
				end=mid-1;
				
			}
			else if(key>a[mid]) {
				st=mid+1;
			}
		}
		return -1;
	}
	public static int RecursiveBinarySearch(int[] a,int val,int st,int end) {
		if(st>end) {
			return -1;
		}
		int mid=st+(end-st)/2;
		if(a[mid]==val) {
			return mid;
		}
		else if(a[mid]<val) {
			return RecursiveBinarySearch(a, val, mid+1, end);
		}
		else {
			return RecursiveBinarySearch(a, val, st, mid-1);	
		}
	}
	
	public static void BubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		System.out.println("BubbleSort ->"+Arrays.toString(a));
	}
	
	public static void RecursiveBubbleSort(int[] a,int st,int end) {
		if(st==a.length) {
			return;
		}
		RecursiveSort(a,0,a.length-1-st);
		RecursiveBubbleSort(a, st+1, end);
	}
	public static void RecursiveSort(int[] a,int j,int end) {
		if(j==end) {
			return;
		}
		if(a[j]>a[j+1]) {
			swap(a,j,j+1);
		}
		RecursiveSort(a,j+1,end);
	}
	public static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void BubbleSort1(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
				}
			}
		}
		System.out.println("BubbleSort1   -->"+Arrays.toString(a));
	}	
	public static void sort(int[] a) {
		if(a.length==1) {
			return;
		}
		int[] left=new int[a.length/2];
		int[] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	
	public static void merge(int[] a,int[] b,int[] c) {
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else {
				c[k++]=b[j++];
			}
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
	}
	public static void QuickSort(int[] a,int st,int end) {
		if(st>=end) {
			return;
		}
		int i=st;
		int j=end;
		int mid=(st+end)/2;
		if(i<j) {
		while(a[i]<a[mid]) {
			i++;
		}
		while(a[j]>a[mid]) {
			j--;
		}
		if(i<=j) {
			Swap(a,i,j);
			i++;
			j--;
		}
		QuickSort(a,st,j);
		QuickSort(a,i,end);
		
		}
	}
	public static void Swap(int[] a,int i,int j ) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
	
}
