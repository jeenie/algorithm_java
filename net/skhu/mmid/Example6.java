package net.skhu.mmid;

import java.util.Arrays;

public class Example6 {
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; ++i)
			System.out.printf("%d ", a[i]);
		System.out.println();
	}

	//�迭 a���� i��ġ�� j��ġ�� ���� ���� �ٲ۴�
	static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	//�迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
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
			int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ� 
			swap(a, i, minIndex); // �� ���� i ��ġ�� �̵��Ѵ� 
			print(a);
		} 
	}


	public static void main(String[] args) {
		int[] a = { 7, 4, 1, 9, 3 }; 

		selectionSort(a); 
	}

}
