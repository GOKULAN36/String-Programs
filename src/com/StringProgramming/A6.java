package com.StringProgramming;
public class A6 {
	public static void main(String[] args) {
		String s="java is easy";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char cnt='1';
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]=++cnt;
				}
			}
			if(cnt!=1) cnt='1';
		}
		System.out.println(ch);
	}
}
