package net.skhu.sort.selection;

import java.util.Arrays;

public class Example2 {

	//배열 a에서 i위치와 j위치의 값을 서로 바꾼다
	static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		int[] a = { 2, 4 };

		System.out.println(Arrays.toString(a));
		swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}
}