package net.skhu.mmid;

public class Example1 {

	static void method1(int a[],  int index) {
		if(index < 1) return;
		System.out.printf("%d ", a[index]);
		method1(a, index-1);
	}
	public static void main(String[] args) {
		int[] a = { 3, 5, 7, 9 };
		method1(a, a.length-1);
	}

}
