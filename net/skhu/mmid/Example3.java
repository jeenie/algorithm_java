package net.skhu.mmid;

public class Example3 {

	static void method1(int a[],  int index) {
		if(index >= a.length) return;
		method1(a, index+1);
		System.out.printf("%d ", a[index]);
	}
	public static void main(String[] args) {
		int[] a = { 2, 4, 5 };
		method1(a, 0);
	}

}
