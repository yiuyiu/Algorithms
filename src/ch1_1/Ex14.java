package ch1_1;

public class Ex14 {
    public static int lg(int a) {
        int result = 2;
        int b = 0;
        while (result <= a) {
            result = result * 2;
            b = b + 1;
        }
        return b;
    }

    public static void main(String[] args) {
        int inp = Integer.parseInt(args[0]);
        System.out.println(lg(inp));
    }
}