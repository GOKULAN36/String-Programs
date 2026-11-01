package com.StringProgramming;

public class Aug_28 {
	public static void main(String[] args) {
		System.out.println(SearchIdx("java",'a'));
		Ascending("cba");
		Decending("abc");

		System.out.println("Ispanagram("+Ispanagram("abcdefehijklmnopqrstuvwxyz")+")");
		System.out.println(MisssingVowels("Am Indian"));
	}
	public static int SearchIdx(String s,char ch) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
	public static void Ascending(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]>ch[j]) {
					swap(ch,i,j);
				}
			}
		}
		System.out.println(ch);
	}
	public static void Decending(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]<ch[j]) {
					char temp=ch[i];
					 ch[i]=ch[j];
					 ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
	}
	public static boolean Ispanagram(String s) {
		if(s.length()<26) {
			return false;
		}
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+""))
				return false;
		}
		return true;
	}
	public static String MisssingVowels(String s) {
		String vowels="AEIOUaeiou";
		String res="";
		for(int i=0;i<vowels.length();i++) {
			if(!s.contains(vowels.charAt(i)+"")) res+=vowels.charAt(i);
		}
		return res;
	}
	public static void swap(char[] ch,int i,int j) {
		char temp=ch[i];
		 ch[i]=ch[j];
		 ch[j]=temp;
	}
}
