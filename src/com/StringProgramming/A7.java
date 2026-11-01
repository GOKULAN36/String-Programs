package com.StringProgramming;
public class A7 {
	public static void main(String[] args) {
		System.out.println(encode("abc",2));
		System.out.println(decode("0",2));
	}
	public static String encode(String s,int n) {
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(((ch[i]+n-'a')%26)+'a');
			}
			else {
				ch[i]=(char)(((ch[i]+n-'A')%26)+'A');
			}
		}
		return new String(ch);
	}
		public static String decode(String s,int n) {
			return encode(s,-n);
		
	}
}
