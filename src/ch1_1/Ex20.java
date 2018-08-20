package ch1_1;

public class Ex20 {
	public static double f1(int N) {
		if (N == 0)
			return 0;
		return Math.log(N) + f1(N - 1);
	}

	public static void main(String[] args) {
		System.out.println(f1(10));
	}
}
