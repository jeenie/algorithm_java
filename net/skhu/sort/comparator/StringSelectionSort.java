package net.skhu.sort.comparator;

import java.util.Arrays;

public class StringSelectionSort {

	//배열 a에서 i위치와 j위치의 값을 서로 바꾼다
		static void swap(String[] a, int i, int j) {
			String t = a[i];
			a[i] = a[j];
			a[j] = t;
		}

		//배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
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
				int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서 
				swap(a, i, minIndex); // 그 값을 i 위치로 이동한다 
			} 
		}
	public static void main(String[] args) {
		String[] a = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		
		System.out.println("정렬 전 배열");
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println("selectionSort");
		selectionSort(a); 
		System.out.println(Arrays.toString(a));
	}

}
