package net.skhu.mmid;

import java.util.Arrays;

public class Example7 {

	static void print(int[] a) {
		for(int i = 0; i < a.length; ++i)
			System.out.printf("%d ", a[i]);
		System.out.println();
	}

	//배열 a에서 i위치와 j위치의 값을 서로 바꾼다
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//bubble sort
	static void bubbleSort(int[] a) {
		for(int i = a.length - 1; i>=1; --i) {
			boolean check = true;
			for(int j = 0; j<i; ++j) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					check = false; 
				}
			}
			print(a);
			if(check) break;

		}
	}

	public static void main(String[] args) {
		int[] a = { 7, 4, 1, 9, 3 }; 

		bubbleSort(a); 
		//System.out.println(Arrays.toString(a));
	}

}
