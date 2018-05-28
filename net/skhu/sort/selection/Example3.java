package net.skhu.sort.selection;

public class Example3 {

	//배열 a에서 가장 작은 값의 위치(index)를 리턴
	static int findMin(int[] a) {
		int index = 0;
		for(int i = 1; i < a.length; i++) 
			if(a[index] > a[i])
				index = i;
		return index;
	}
	
	public static void main(String[] args) {
		int[] a1 = { 17, 14, 11, 19 }; 
		int[] a2 = { -17, -14, -11, -19 }; 
		
		int minIndex = findMin(a1); 
		System.out.println(a1[minIndex]); 
		
		minIndex = findMin(a2); 
		System.out.println(a2[minIndex]);
	}

}
