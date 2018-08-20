package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex19 {
	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static long F2() {
		long[] arr = new long[100];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < 100; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[92];
//		arr[92] is a positive number ,but arr[93] is a negative number
	}

	public static void F1() {
		for (int N = 0; N < 100; N++)
			StdOut.println(N + " " + F(N));
	}

	public static void main(String[] args) {
		StdOut.println(F2());
	}
}
