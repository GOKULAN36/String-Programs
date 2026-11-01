package com.StringProgramming;

public class A3 {
	public static void main(String[] args) {
		String s="BOSSSSSS";
		
		char[] ch=s.toCharArray();
		for (int i = 1; i < ch.length; i++) {
			if (ch[i]==ch[i-1]) {
				if (ch[i-1]!='$') {
					ch[i]='$';
				}
			}
		}
		System.out.print(ch);
	}
}
