package net.skhu.generic;

class GenericArray<T> {
	T[] a;

	public GenericArray(int size) {
		this.a = (T[]) new Object[size];
	}

	public T get(int index) {
		return this.a[index];
	}

	public void put(int index, T value) {
		this.a[index] = value;
	}
}

public class Example2 {
	public static void main(String[] args) {
		GenericArray<String> g = new GenericArray<String>(5);
		g.put(0, new String("jee"));
		g.put(1, new String("kim"));
		String s0 = g.get(0);
		String s1 = g.get(1);
		System.out.printf("%s %s\n", s0, s1);
	}
}