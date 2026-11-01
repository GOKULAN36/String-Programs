package com.StringProgramming;
public class Sept_2 {
	public static void main(String[] args) {
		String s="malayam";
		Occ(s);
	}
	public static void IsSubStringLarPalindrome(String s){
		int maxlen=0;
		String res="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+3;j<s.length();j++) {
				String str=s.substring(i,j);
				if(isPalin(str)&&str.length()>maxlen) {
					maxlen=str.length();
					res=str;			
				}
			}
			System.out.println(res);
		}
	}
	public static boolean isPalin(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	public static void Occ(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ')continue;
			String res=""+ch[i]+"->"+i;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=' ';
					res+=","+j;
				}
			}
			ch[i]=' ';
			System.out.println(res);
		}
	}
}
