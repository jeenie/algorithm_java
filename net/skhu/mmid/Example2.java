package net.skhu.mmid;

public class Example2 {

	static void method1(int a[],  int index) {
		if(index >= a.length) return;
		System.out.printf("%d ", a[index]);
		method1(a, index+1);
	}
	public static void main(String[] args) {
		int[] a = { 2, 4, 5 };
		method1(a, 0);
	}

}
