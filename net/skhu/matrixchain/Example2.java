package net.skhu.matrixchain;

public class Example2 {
	static class Matrix {
		int row, col;

		public Matrix(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int ����Ƚ���ּҰ�(Matrix[] a, int start, int end) throws Exception {
		if (start == end)
			return 0;
		System.out.printf("(%d, %d) ", start, end);
		int �ּҰ� = Integer.MAX_VALUE;
		for (int middle = start; middle < end; ++middle) {
			int Ƚ�� = ����Ƚ���ּҰ�(a, start, middle);
			Ƚ�� += ����Ƚ���ּҰ�(a, middle + 1, end);
			Ƚ�� += a[start].row * a[middle].col * a[end].col;
			if (Ƚ�� < �ּҰ�)
				�ּҰ� = Ƚ��;
		}
		return �ּҰ�;
	}

	public static void main(String[] args) throws Exception {
		Matrix[] a = new Matrix[] { new Matrix(10, 100), new Matrix(100, 5), new Matrix(5, 50), new Matrix(50, 3),
				new Matrix(3, 8), new Matrix(8, 30) };
		System.out.println(����Ƚ���ּҰ�(a, 0, a.length - 1));
	}
}