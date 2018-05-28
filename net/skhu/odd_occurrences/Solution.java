package net.skhu.odd_occurrences;

import java.util.Scanner;

public class Solution {
	static int solution(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 0)
				continue;
			boolean check = false;
			for (int j=i+1; j < a.length; j++) {
				if (a[j] == 0) continue;
				if (a[i] == a[j]) {
					a[i] = a[j] = 0;
					check = true;
				}
			}
			if(!check)
				return a[i];
		}
		return 0;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
			a[i] = input.nextInt();
		
		System.out.println(solution(a));
	}
}
