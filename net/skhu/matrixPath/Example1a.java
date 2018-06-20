package net.skhu.matrixPath;

//중복호출이 많아 비효율적...개선하자! => 동적 프로그래밍
public class Example1a {
	static int[][] a = { { 6, 7, 12, 5 }, { 5, 3, 11, 18 }, { 7, 17, 3, 3 }, { 8, 10, 14, 9 } };

	static int 점수(int r, int c) {
		System.out.printf("점수(%d, %d) ", r, c);
		int 이전단계점수 = 0;
		if (r == 0 && c == 0)
			이전단계점수 = 0;
		else if (r == 0)
			이전단계점수 = 점수(r, c - 1);
		else if (c == 0)
			이전단계점수 = 점수(r - 1, c);
		else
			이전단계점수 = Math.min(점수(r, c - 1), 점수(r - 1, c));
		return 이전단계점수 + a[r][c];
	}

	public static void main(String[] args) {
		System.out.println(점수(3, 3));
	}
}