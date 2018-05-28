package net.skhu.sortingNetwork;

import java.util.Arrays;

public class Example2 {
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void sort2(int[] a, int start) {
		if (a[start] > a[start + 1])
			swap(a, start, start + 1);
	}

	static void sort3(int[] a, int start) {
		if (a[start] > a[start + 1])
			swap(a, start, start + 1);
		if (a[start] > a[start + 2])
			swap(a, start, start + 2);
		if (a[start + 1] > a[start + 2])
			swap(a, start + 1, start + 2);
	}

	static void sort4(int[] a, int start) {
		if (a[start] > a[start + 1])
			swap(a, start, start + 1);
		if (a[start + 2] > a[start + 3])
			swap(a, start + 2, start + 3);
		if (a[start] > a[start + 2])
			swap(a, start, start + 2);
		if (a[start + 1] > a[start + 3])
			swap(a, start + 1, start + 3);
		if (a[start + 1] > a[start + 2])
			swap(a, start + 1, start + 2);
	}

	static void sort5(int[] a, int start) {
		if (a[start] > a[start + 1])
			swap(a, start, start + 1);
		if (a[start + 2] > a[start + 3])
			swap(a, start + 2, start + 3);
		if (a[start + 1] > a[start + 3])
			swap(a, start + 1, start + 3);
		if (a[start + 3] > a[start + 4])
			swap(a, start + 3, start + 4);
		sort4(a, start);
	}

	static void sort6(int[] a, int start) {
		if (a[start] > a[start + 1])
			swap(a, start, start + 1);
		if (a[start + 2] > a[start + 3])
			swap(a, start + 2, start + 3);
		if (a[start + 4] > a[start + 5])
			swap(a, start + 4, start + 5);
		if (a[start] > a[start + 2])
			swap(a, start, start + 2);
		if (a[start] > a[start + 4])
			swap(a, start, start + 4);
		if (a[start + 3] > a[start + 5])
			swap(a, start + 3, start + 5);
		if (a[start + 1] > a[start + 5])
			swap(a, start + 1, start + 5);
		sort4(a, start + 1);
	}

	static void checkSorted(int[] a) {
		for (int i = 0; i < a.length - 1; ++i)
			if (a[i] > a[i + 1]) {
				System.out.println("error");
				System.exit(0);
			}
	}

	public static void main(String[] args) {
		int[] a1 = { 32, 13 };
		int[] a2 = { 32, 14, 20 };
		int[] a3 = { 5, 32, 14, 20 };
		int[] a4 = { 5, 2, 20, 14, 9 };
		int[] a5 = { 10, 5, 2, 20, 14, 9 };
		sort2(a1, 0);
		sort3(a2, 0);
		sort4(a3, 0);
		sort5(a4, 0);
		sort6(a5, 0);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(a5));
		checkSorted(a1);
		checkSorted(a2);
		checkSorted(a3);
		checkSorted(a4);
		checkSorted(a5);
	}
}