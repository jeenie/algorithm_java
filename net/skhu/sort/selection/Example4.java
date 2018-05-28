package net.skhu.sort.selection;

public class Example4 {


	//�迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
	static int findMin(int[] a, int start) {
		int index = start;
		for(int i = start + 1; i < a.length; i++)
			if(a[index]>a[i])
				index = i;
		return index;
	}

	public static void main(String[] args) {
		int[] a = { 14, 11, 13, 15 }; 

		for (int i = 0; i < a.length; ++i) { 
			int minIndex = findMin(a, i); 
			System.out.println(a[minIndex]); 
		}
	}

}
