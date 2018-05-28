package net.skhu.sortingNetwork;

import java.util.Arrays;

public class Example1 {
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//배열의 크기가 2일 때 비교 ,if문 1개
	static void sort2(int[] a, int start) {
		int end = start + 1;
		if (a[start] > a[end])
			swap(a, start, end);
	}

	//배열의 크기가 3일 때 비교, if문 3개
	static void sort3(int[] a, int start) {
		if (a[start] > a[start + 1])
			swap(a, start, start + 1);
		if (a[start] > a[start + 2])
			swap(a, start, start + 2);
		if (a[start + 1] > a[start + 2])
			swap(a, start + 1, start + 2);
	}

	public static void main(String[] args) {
		int[] a1 = { 32, 13 };
		int[] a2 = { 32, 14, 20 };
		sort2(a1, 0);
		sort3(a2, 0);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}