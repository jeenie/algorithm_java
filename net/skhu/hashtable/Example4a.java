package net.skhu.hashtable;

import net.skhu.hashtable.Example4.HashTable;

public class Example4a {
	static class HashTable {
		static final int EMPTY = 0;
		static final int DELETED = -1;
		static final int SIZE = 37;
		int[] a;

		public HashTable() {
			a = new int[SIZE];
		}

		public void add(int value) throws Exception {
			int startIndex = value % SIZE; // ������ ��ġ ���
			int count = 0; // �浹 Ƚ��
			do {
				int index = (startIndex + count) % SIZE; // ������ ��ġ ���
				if (a[index] == EMPTY || a[index] == DELETED) { // �� ĭ�̰ų� ������ ĭ�̸�
					a[index] = value; // �����ϰ� ����
					return;
				} else if (a[index] == value)
					return; // �̹� �� ���� ��������� �׳� ����
				++count; // ������� ������, �浹�� �Ͼ ��Ȳ. �浹 Ƚ�� ����
			} while (count < a.length); // �浹 Ƚ���� �迭�� ũ�⺸�� ũ�ų� ������ �۾� ����
			throw new Exception("���� ����");
		}

		public void remove(int value) {
			int startIndex = value % SIZE; // ������ ��ġ ���
			int count = 0;

			do {
				int index = (startIndex + count) % SIZE; // ������ ��ġ ���
				if (a[index] == EMPTY || a[index] == DELETED)
					return; // �� ĭ�̸� �� ���� �ؽ� ���̺� ����.
				else if (a[index] == value) {
					a[index] = -1; // ã����, �� ����
					return;
				}
				++count; // ������� ������, �浹�� �Ͼ ��Ȳ. �浹 Ƚ�� ����
			} while (count < a.length); // �浹 Ƚ���� �迭�� ũ�⺸�� ũ�ų� ������ �۾� ����
		}

		public boolean contains(int value) {
			int startIndex = value % SIZE; // ������ ��ġ ���
			int count = 0; // �浹 Ƚ��
			do {
				int index = (startIndex + count) % SIZE; // ������ ��ġ ���
				if (a[index] == EMPTY || a[index] == DELETED)
					return false; // �� ĭ�̸� �� ���� �ؽ� ���̺� ����.
				else if (a[index] == value)
					return true; // ã����.
				++count; // ������� ������, �浹�� �Ͼ ��Ȳ. �浹 Ƚ�� ����
			} while (count < a.length); // �浹 Ƚ���� �迭�� ũ�⺸�� ũ�ų� ������ �۾� ����
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		int maxValue = 200, maxCount = 10;
		HashTable hashTable = new HashTable();
		int[] data = { 4, 13, 144, 7, 9, 11, 44, 115, 107, 196 };
		for (int i = 0; i < data.length; ++i)
			hashTable.add(data[i]);
		System.out.println("����� ������ ���� ����մϴ�.");
		for (int i = 1; i <= maxValue; ++i)
			if (hashTable.contains(i))
				System.out.print(i + " ");
		System.out.println();
		System.out.println("---------------------------------\n7�� �����մϴ�.");
		hashTable.remove(7);
		for (int i = 1; i <= maxValue; ++i)
			if (hashTable.contains(i))
				System.out.print(i + " ");
		System.out.println();
		System.out.println("---------------------------------\n51�� �߰��մϴ�.");
		hashTable.add(51);
		for (int i = 1; i <= maxValue; ++i)
			if (hashTable.contains(i))
				System.out.print(i + " ");
	}
}