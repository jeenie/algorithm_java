package net.skhu.mmid;

import java.util.Arrays;

public class Example6 {
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; ++i)
			System.out.printf("%d ", a[i]);
		System.out.println();
	}

	//배열 a에서 i위치와 j위치의 값을 서로 바꾼다
	static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	//배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
	static int findMin(int[] a, int start) {
		int index = start;
		for(int i = start + 1; i < a.length; i++)
			if(a[index]>a[i])
				index = i;
		return index;
	}

	// selection sort 
	static void selectionSort(int[] a) { 
		for (int i = 0; i < a.length - 1; ++i) { 
			int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서 
			swap(a, i, minIndex); // 그 값을 i 위치로 이동한다 
			print(a);
		} 
	}


	public static void main(String[] args) {
		int[] a = { 7, 4, 1, 9, 3 }; 

		selectionSort(a); 
	}

}
