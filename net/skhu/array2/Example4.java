package net.skhu.array2;

import java.util.Arrays;

public class Example4 {
	public static void main(String[] args) {
		int[][] a1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] a2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.deepEquals(a1, a2));
	}
}