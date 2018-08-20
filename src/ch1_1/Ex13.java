package ch1_1;

import java.util.Arrays;

public class Ex13 {
    public static int[][] transpose(int[][] arr) {
        int[][] b = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                b[j][i] = arr[i][j];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] result = transpose(a);
        for (int i = 0; i < result.length; i++)
            System.out.println(Arrays.toString(result[i]));
    }
}