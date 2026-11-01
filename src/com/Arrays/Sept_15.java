package com.Arrays;

public class Sept_15 {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		SpiralMatrix(a);
		
		
		
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		TransposeMatrix(arr1);
	}
	public static void SpiralMatrix(int[][] a) {
		int n=a.length;
		char dir='R';
		int row=0;
		int col=-1;
		for(int i=1;i<=n*n;i++) {
			switch (dir) {
			case 'R':{
				col++;
				a[row][col]=i;
				if(col==n-1||a[row][col+1]!=0)dir ='D';
			}
			break;
			case 'D':{
				row++;
				a[row][col]=i;
				if(row==n-1||a[row+1][col]!=0)dir ='L';
			}
			break;
			case 'L':{
				col--;
				a[row][col]=i;
				if(col==0||a[row][col-1]!=0)dir ='U';
			}
			break;
			case 'U':{
				row--;
				a[row][col]=i;
				if(a[row-1][col]!=0)dir ='R';
			}
			break;
			}
		}
	}
	public static void TransposeMatrix(int[][] a) {
		int[][] b=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
