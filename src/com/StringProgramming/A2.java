package com.StringProgramming;
//repeated character
public class A2 {
	public static void main(String[] args) {
		String s="java";
		
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			int cnt=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
				cnt++;
				}
			}
			if(cnt>0)System.out.print(ch[i]);
		}
		
	}
}
