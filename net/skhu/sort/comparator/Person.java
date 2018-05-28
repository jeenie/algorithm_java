package net.skhu.sort.comparator;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Person) == false)
			return false;
		Person p = (Person) obj;
		return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
	}

	@Override
	public String toString() {
		return String.format("Person{name=\"%s\", age=%d}", name, age);
	}

	@Override 
	public int compareTo(Person p) { 
		int r = this.name.compareTo(p.name); // 먼저 이름(name)을 비교한다. 
		if (r != 0) return r; // 이름이 같지 않다면, 이름 비교 결과를 리턴한다. 
		return this.age - p.age; // 이름이 같다면, 나이(age) 비교 결과를 리턴한다. 
	}
}
