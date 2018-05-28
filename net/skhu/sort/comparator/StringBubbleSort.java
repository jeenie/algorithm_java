package net.skhu.sort.comparator;

import java.util.Arrays;

public class StringBubbleSort {

	//배열 a에서 i위치와 j위치의 값을 서로 바꾼다
		static void swap(String[] a, int i, int j) {
			String temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		//bubble sort
		static void bubbleSort(String[] a) {
			for(int i = a.length - 1; i>=1; --i) {
				for(int j = 0; j<i; ++j) {
					if(a[j].compareTo(a[j+1]) > 0)
						swap(a, j, j+1);
				}
			}
		}
		
		public static void main(String[] args) {
			String[] a = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" }; 
			
			System.out.println("정렬 전 배열");
			System.out.println(Arrays.toString(a));
			System.out.println();
			System.out.println("bubbleSort");
			bubbleSort(a); 
			System.out.println(Arrays.toString(a));
		}
}
