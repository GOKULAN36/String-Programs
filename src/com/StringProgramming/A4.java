package com.StringProgramming;

public class A4 {
	public static void main(String[] args) {
		String s="javadev";
		
		char[] ch=s.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]='_';
				cnt++;
			}
		}
		if(cnt>=3)System.out.println(ch);
		else System.out.println(s);
	}
}
