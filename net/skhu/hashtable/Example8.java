package net.skhu.hashtable;

import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {
		int hashTableSize = 13;
		int step = 4;
		int startIndex = 3;
		int[] a = new int[hashTableSize];
		for (int i = 0; i < hashTableSize; ++i) {
			int index = (startIndex + (step * i)) % hashTableSize;
			a[i] = index;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}