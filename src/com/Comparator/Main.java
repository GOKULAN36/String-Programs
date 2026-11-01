package com.Comparator;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Capacity");
		int n=sc.nextInt();
		Mobile[] mob= new Mobile[n];
		int count=0;
		boolean stop=true;
		while(stop) {
			System.out.println("                    ");
			System.out.println("1 Add Item");
			System.out.println("2 sortByName");
			System.out.println("3 sortByRAM");
			System.out.println("4 sortByROM");
			System.out.println("5 sortByPRICE");
			System.out.println("6 sortByColor");
			System.out.println("7 EXit");
			System.out.println("                    ");			
			
			int res=sc.nextInt();
			
			switch(res) {
			case 1:
				int a=n;
				while(a-->0) {
					System.out.println("Name ,RAM, ROM, Color, Price ");
					String name=sc.next().toLowerCase();
					
					int ram=sc.nextInt();
					int rom=sc.nextInt();
					String color=sc.next().toLowerCase();
					
					double price=sc.nextDouble();
					
				
				Mobile m1=new Mobile(name,ram,rom,color,price);
				
				mob[count++]=m1;
				
				System.out.println("Added SuccessFully");
				}
				break;
			case 2:
				Arrays.sort(mob,new SortByName());
				for(Mobile m:mob) {
					System.out.println(m);
				}
				System.out.println("");
				break;
			case 3:
				Arrays.sort(mob,new SortByRam());
				for(Mobile m:mob) {
					System.out.println(m);
				}
				System.out.println("");
				break;
			case 4:
				Arrays.sort(mob,new SortByRom());
				for(Mobile m:mob) {
					System.out.println(m);
				}
				System.out.println("");
				break;
			case 5:
				Arrays.sort(mob,new SortByPrice());
				for(Mobile m:mob) {
					System.out.println(m);
				}
				System.out.println("");
				break;
			case 6:
				Arrays.sort(mob,new SortByColor());
				for(Mobile m:mob) {
					System.out.println(m);
				}
				System.out.println("");
				break;
			case 7:
				stop=false;
				break;
		}	
		}
		System.out.println("Thank You Visit Again");
	}
}


/*
iphone 
16
512
wjite
100000.0
iqoo 
8
128
green
12999.0
redmi
4
64
black
8999.0
 */