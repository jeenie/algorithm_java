package net.skhu.mmid;

import java.util.Scanner;
public class Example5 {

	static int sum(int n) {
		if(n < 1) return 1;
		System.out.printf("%d ", n);
		return n + sum(n-1);
	}
	public static void main(String[] args) {
		System.out.printf("%d ", sum(3));

	}

}
