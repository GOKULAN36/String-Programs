package com.encapsulation;
class Mobile{
	private String Model;
	private String color;
	private int ram;
	private int rom;
	private double price;
	
	public Mobile(String Model,String color,int ram,int rom,double price) {
		this.Model=Model;;
		this.color=color;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
	}

	public String getModel() {
		return Model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public double getPrice() {
		return price;
	}
}
public class B1 {
	public static void main(String[] args) {
		Mobile m=new Mobile("IQOO","Green",6,128,12999);
		System.out.println(m.getColor());
		System.out.println(m.getModel());
		m.setRam(12);
		System.out.println(m.getRam());
		System.out.println(m.getPrice());
	}
}

