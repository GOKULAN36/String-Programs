package com.Comparator;

import java.util.Comparator;

public class SortByName implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return e1.name.compareTo(e2.name);
	}
}
class SortByRam implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return e1.ram-e2.ram;
	}
}
class SortByRamReverse implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return e2.ram-e1.ram;
	}
}
class SortByRom implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return e1.rom-e2.rom;
	}
}
class SortByRomReverse implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return e2.rom-e1.rom;
	}
}
class SortByColor implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return e1.color.compareTo(e2.color);
	}
}
class SortByPrice implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return (int)(e1.price-e2.price);
	}
}
class SortByPriceReverse implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile e1=(Mobile)o1;
		Mobile e2=(Mobile)o2;
		return (int)(e2.price-e1.price);
	}
}
