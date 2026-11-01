package com.StringProgramming;

public class Aug_31 {
	public static void main(String[] args) {
		String s="abc";
		permutation(s,0,s.length()-1);
		Homework hw=new Homework();
		hw.Palindrome("madam is malayalam");
		hw.LargestPalindrome("madam is malayalam");
	}
	public static void permutation(String s,int st,int end) {
		if(st==end) {
			System.out.println(s);
			return;
		}
		for(int i=st;i<=end;i++) {
			String s1=swap(s,st,i);
			permutation(s1,st+1,end);
		}
	}
	public static String swap(String s,int i,int j) {
		char[] ch=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	} 
}
class Homework{
	public void Palindrome(String s) {
		String[] str=s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			boolean res=Reverse(str[i]);
			if(res) {
				System.out.println(str[i]+" ");
			}
		}
	}
	public static boolean Reverse(String s) {
		char[] ch=s.toCharArray();
		int left=0,right=ch.length-1;
		while(left<right) {
			if(ch[left]!=ch[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public void LargestPalindrome(String s) {
		String[] str=s.split(" ");
		int lar=0;
		String result="";
		for(int i=0;i<str.length;i++) {
			boolean res=Reverse(str[i]);
			if(res && str[i].length()>lar) {
				lar=str[i].length();
				result=str[i];
			}
		}
		System.out.println(result+"-->"+result.length());
	}
	
}
