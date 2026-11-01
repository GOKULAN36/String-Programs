package com.Arrays;

public class Sept_16 {
	public static void main(String[] args) {
		
		pascal();
		System.out.println();
		matrix_Multiplication();
		System.out.println();
		diagonal_Matrix();
	}
	static void pascal() {
		int n=5;
		int[][] a=new int[n][];
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0||i==j) {
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++)System.out.print(" ");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void matrix_Multiplication() {
		int[][] a= {
				{1,2,1},
				{2,2,3},
				{1,1,1}};
		int[][] b= {
				{2,1,2},
				{2,2,1},
				{1,3,2}};
		int[][] res=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					res[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int[] arr:res) {
			for(int n:arr) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		
	}
	public static void diagonal_Matrix() {
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i][i];
			if(i!=a.length-1) sum+=a[i][a.length-1-i];
				
		}
		System.out.println(sum);
	}
}
