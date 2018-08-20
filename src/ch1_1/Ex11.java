package ch1_1;

public class Ex11 {
    public static void main(String[] args) {
        boolean arr[][] = { { true, false, true }, { false, true, false } };
        for (int i = 0; i < arr.length; i++) {
            System.out.print("row" + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j])
                    System.out.print("col" + j + ":* ");
                if (!arr[i][j])
                    System.out.print("col" + j + ":  ");
            }
            System.out.println();
        }
    }
}