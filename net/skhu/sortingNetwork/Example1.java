package net.skhu.sortingNetwork;

import java.util.Arrays;

public class Example1 {
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//�迭�� ũ�Ⱑ 2�� �� �� ,if�� 1��
	static void sort2(int[] a, int start) {
		int end = start + 1;
		if (a[start] > a[end])
			swap(a, start, end);
	}

	//�迭�� ũ�Ⱑ 3�� �� ��, if�� 3��
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