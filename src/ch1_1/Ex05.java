package ch1_1;

public class Ex05 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        System.out.println(a > 0 && a < 1 && b < 1 && b > 0);
    }
}
