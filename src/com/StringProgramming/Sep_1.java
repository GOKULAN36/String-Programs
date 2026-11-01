package com.StringProgramming;
public class Sep_1 {
	public static void main(String[] args) {
		String s="java is very very easy java";
		 System.out.print("Duplicate words--->");
		DuplicateWords("Happy Happy birthday to you");
		System.out.println("--------------------------------------------");
		System.out.print("OccuranceWords--->");
		OccuranceWords(s);
	}
	
	public static void OccuranceWords(String s) {
		String[] str=s.split(" ");
		String res="";
		for(int i=0;i<str.length;i++) {
			if(str[i]=="") continue;
			int cnt=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					cnt++;
					str[j]="";
				}
			}
			res+=str[i]+"="+cnt+" ";
		}
		System.out.println(res.trim());
	}
	public static void DuplicateWords(String s) {
		String[] str=s.split(" ");
		String res="";
		for(int i=0;i<str.length;i++) {
			if(str[i]=="") continue;
			
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					str[j]="";
				}
			}
			res+=str[i]+" ";
		}
		System.out.println(res.trim());
	}
}
