package net.skhu.sort.comparator;

import java.util.Arrays;

public class StringSelectionSort {

	//�迭 a���� i��ġ�� j��ġ�� ���� ���� �ٲ۴�
		static void swap(String[] a, int i, int j) {
			String t = a[i];
			a[i] = a[j];
			a[j] = t;
		}

		//�迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
		static int findMin(String[] a, int start) {
			int index = start;
			for(int i = start + 1; i < a.length; i++)
				if(a[index].compareTo(a[i])>0)
					index = i;
			return index;
		}

		// selection sort 
		static void selectionSort(String[] a) { 
			for (int i = 0; i < a.length - 1; ++i) { 
				int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ� 
				swap(a, i, minIndex); // �� ���� i ��ġ�� �̵��Ѵ� 
			} 
		}
	public static void main(String[] args) {
		String[] a = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		
		System.out.println("���� �� �迭");
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println("selectionSort");
		selectionSort(a); 
		System.out.println(Arrays.toString(a));
	}

}
