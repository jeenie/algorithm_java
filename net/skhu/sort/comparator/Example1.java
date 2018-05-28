package net.skhu.sort.comparator;

import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("È«±æµ¿", 18), new Person("ÀÓ²©Á¤", 22), new Person("Àü¿ìÄ¡", 23) };
		Arrays.sort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));
	}
}
