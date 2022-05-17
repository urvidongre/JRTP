package com.nt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 6));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		ArrayList<Integer> al1 = new ArrayList(lhs);
		System.out.println(al);
		System.out.println(al1);

	}
}
