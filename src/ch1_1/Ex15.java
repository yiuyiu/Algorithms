package ch1_1;

import java.util.Arrays;

public class Ex15 {
    public static int[] histogram(int[] a, int M) {
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            int num = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j])
                    num += 1;
            }
            arr[i] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 2, 1, 2, 3 };
        System.out.print(Arrays.toString(histogram(a, 4)));
    }
}