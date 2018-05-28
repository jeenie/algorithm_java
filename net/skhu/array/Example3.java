package net.skhu.array;

import java.util.Random;

public class Example3 {
	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

	//선택정렬
	static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i)
			for (int j = i + 1; j < a.length; ++j)
				if (a[i] > a[j])
					swap(a, i, j);
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(20);
		print(a);
		System.out.println();
		sort(a);
		print(a);
	}
}