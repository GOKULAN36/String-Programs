package com.Arrays;

import java.util.Arrays;
import java.util.*;

public class oct_30 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,6,4,10);
//		list.stream()
//					.map(n->n*3)
//					.filter(n->n%2==0)
//					.forEach(n->System.out.println(n));
//		
		list.stream()
					.filter(n-> String.valueOf(n).startsWith("1")).forEach(n->System.out.println(n));
		
	}
}
