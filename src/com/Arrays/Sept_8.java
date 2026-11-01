package com.Arrays;

public class Sept_8 {

	public static void main(String[] args) {
		int[] arr= {9,5,3,2,6,7,1,9};
		SecMax(arr);
		SecMin(arr);
		NonRep(arr);
		int idx=Search(arr,2);
		System.out.println("==>"+idx);
		
		
		
		int num=912;
		pw((num/10000000)%100," crores");
		pw((num/100000)%100," lakhs");
		pw((num/1000)%100," thousand");
		pw((num/100)%100," hunderd");
		pw(num%100,"");
		
	}
	public static void SecMax(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax &&arr[i]!=max) { 
				secmax=arr[i];
			}
		}
		System.out.println("max"+max);
		System.out.println("secmax"+secmax);
		System.out.println("----------------------------------");
	}
public static void SecMin(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secmin=min;
				min=arr[i];
			}
			else if(arr[i]<secmin && arr[i]!=min){
 
				secmin=arr[i];
			}
		}
		System.out.println("min : "+min);
		System.out.println("secmin : "+secmin);
		System.out.println("----------------------------------");
	}
	public static void NonRep(int arr[]) {
		boolean flag;
		for(int i=0;i<arr.length;i++) {
			flag=true;
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]&& i!=j) {
					flag=false;
				}
			}
			if(flag) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(" \n --------------------------------");
	}
	public static int Search(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void pw(int n,String s) {
		String[] one= {""," One","Two "," Three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twele"," thirteen"," fourteen"," fifty"," sixteen"," seventeen"," eighteen"," nineteen"};
		String [] two= {"",""," twenty"," thirty"," fourty"," fifty"," sixty"," sevent"," eighteen"," nineteen"};
		if(n<=19) {
			System.out.print(one[n]);
		}
		else {
			System.out.print(two[n/10]+" "+one[n%10]);
		}
		if(n!=0) {
			System.out.println(s);
		}
	}
}
