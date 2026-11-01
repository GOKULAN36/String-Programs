package com.Arrays;

import java.util.function.Predicate;

public class C1 {
	public static void main(String[] args) {
		Predicate<Integer> pred=a->a%2==0;
		System.out.println(pred.test(23));
	}
}
