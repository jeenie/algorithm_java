package net.skhu.matrixchain;

public class Example2 {
	static class Matrix {
		int row, col;

		public Matrix(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int °ö¼ÀÈ½¼öÃÖ¼Ò°ª(Matrix[] a, int start, int end) throws Exception {
		if (start == end)
			return 0;
		System.out.printf("(%d, %d) ", start, end);
		int ÃÖ¼Ò°ª = Integer.MAX_VALUE;
		for (int middle = start; middle < end; ++middle) {
			int È½¼ö = °ö¼ÀÈ½¼öÃÖ¼Ò°ª(a, start, middle);
			È½¼ö += °ö¼ÀÈ½¼öÃÖ¼Ò°ª(a, middle + 1, end);
			È½¼ö += a[start].row * a[middle].col * a[end].col;
			if (È½¼ö < ÃÖ¼Ò°ª)
				ÃÖ¼Ò°ª = È½¼ö;
		}
		return ÃÖ¼Ò°ª;
	}

	public static void main(String[] args) throws Exception {
		Matrix[] a = new Matrix[] { new Matrix(10, 100), new Matrix(100, 5), new Matrix(5, 50), new Matrix(50, 3),
				new Matrix(3, 8), new Matrix(8, 30) };
		System.out.println(°ö¼ÀÈ½¼öÃÖ¼Ò°ª(a, 0, a.length - 1));
	}
}