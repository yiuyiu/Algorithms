package ch1_1;

public class Ex09 {
    public static void main(String[] args) {
        String s = "";
        int N = Integer.parseInt(args[0]);
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }
}