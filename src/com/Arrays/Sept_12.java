package com.Arrays;

public class Sept_12 {

	public static void main(String[] args) {
		int[][] a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int res1= Secmax(a);
		System.out.println("secmax=>"+res1+"\n");
		int res2=Secmin(a);
		System.out.println("secmin=>"+res2+"\n");
		
		int []res3=DiagonalSum(a);
		System.out.println("Diagonals --> Left Diagonal = "+res3[0]+" | Right Diagonal = "+res3[1]);

	}
	public static int Secmax(int[][] a) {
		
		int max=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(max<a[i][j]) {
					secmax=max;
					max=a[i][j];
				}
				else if(secmax<a[i][j]&&max!=a[i][j]) {
					secmax=a[i][j];
				}
			}
		}
		return secmax;
	}
public static int Secmin(int[][] a) {
		
		int min=Integer.MAX_VALUE,secmin=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(min>a[i][j]) {
					secmin=min;
					min=a[i][j];
				}
				else if(secmin>a[i][j]&&min!=a[i][j]) {
					secmin=a[i][j];
				}
			}
		}
		return secmin;
	}
public static int[] DiagonalSum(int[][] a) {
	
	int sum1=0;
	int sum2=0;
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(i==j) {
				sum1+=a[i][j];
			}
			if(i+j==a.length+1) {
				sum2+=a[i][j];
			}
		}
	}
	return new int[] {sum1,sum2};
}

}
