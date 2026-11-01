package com.encapsulation;
import java.util.Scanner;

public class Factory_method {
	public static void main(String[] args) {
		Book book1=Book.createBook();
		book1.display();
	}
}

class Book{
	String name;
	String author;
	double price;
	public Book(String name,String author,double price) {
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public static Book createBook() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter book details");
		String name=s.next();
		String Author=s.next();
		double price=s.nextDouble();
		return new Book(name,Author,price);
	}
	public void display() {

		System.out.println("Book name: "+name);
		System.out.println("book author: "+author);
		System.out.println("book price: "+price);
		
	}
}
