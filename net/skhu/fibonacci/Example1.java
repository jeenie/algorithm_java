package net.skhu.fibonacci;

public class Example1 {
	static int fibonacci(int n) {
		
		if (n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int value = fibonacci(7);
		System.out.println(value);
	}
}