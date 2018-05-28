package net.skhu.generic;

import net.skhu.sort.comparator.Person;

class Array {
	Object[] a;

	public Array(int size) {
		this.a = new Object[size];
	}

	//Object배열에서 특정 인덱스의 원소를 리턴
	public Object get(int index) {
		return this.a[index];
	}

	//Object배열에서 특정 인덱스에 객체 삽입
	public void put(int index, Object value) {
		this.a[index] = value;
	}
}

public class Example1 {
	public static void main(String[] args) {
		Array array = new Array(5);
		array.put(0, new String("jee"));
		array.put(1, new Person("kimjee", 23));
		String s0 = (String) array.get(0);
		String s1 = (String) array.get(1).toString();
		System.out.printf("%s %s\n", s0, s1);
	}
}