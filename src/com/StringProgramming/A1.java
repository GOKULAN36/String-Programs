package com.StringProgramming;
//remove duplicates
public class A1 {
	public static void main(String[] args) {
		String s="java";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
					ch[i]='\u0000';
				}
			}
			if(ch[i]!='\u0000')System.out.print(ch[i]);
		}
	}
}
