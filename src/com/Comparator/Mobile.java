package com.Comparator;

public class Mobile {
	String name;
	int ram;
	int rom;
	String color;
	double price;
	public Mobile(String name,int ram,int rom,String color,double price) {
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Mobile[name="+name+" ram="+ram+" rom="+rom+" color="+color+" price"+price+"]";
	}
	
	
}
