package net.skhu.matrixPath;

public class Example1 {
	static int[][] a = { { 6, 7, 12, 5 }, { 5, 3, 11, 18 }, { 7, 17, 3, 3 }, { 8, 10, 14, 9 } };

	static int ����(int r, int c) {
		int �����ܰ����� = 0;
		if (r == 0 && c == 0)
			�����ܰ����� = 0;
		else if (r == 0)
			�����ܰ����� = ����(r, c - 1);
		else if (c == 0)
			�����ܰ����� = ����(r - 1, c);
		else
			�����ܰ����� = Math.min(����(r, c - 1), ����(r - 1, c));
		return �����ܰ����� + a[r][c];
	}

	public static void main(String[] args) {
		System.out.println(����(3, 3));
	}
}