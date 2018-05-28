package net.skhu.sort;

import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
		int[] a1 = new int[] { 10, 11, 12 };
		int[] a2 = { 10, 11, 12 };
		Integer[] b1 = new Integer[] { new Integer(10), new Integer(11), new Integer(12) };
		Integer[] b2 = new Integer[] { 10, 11, 12 };
		Integer[] b3 = { 10, 11, 12 };
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
	}
}