package net.skhu.statics;

class Something {
	int a;
	static int b;

	void method1() {
		a = 1;
		b = 2;
	}

	static void method2() {
		a = 3;
		b = 4;
	}

	void method3() {
		method1();
		method2();
	}

	static void method4() {
		method1();
		method2();
		Something obj1 = new Something();
		Something obj2 = new Something();
		obj1.method1();
	}
}

public class Example1 {
	public static void main(String[] args) {
		Something.method2();
		Something obj3 = new Something();
		obj3.method3();
		Something.method4();
	}
}