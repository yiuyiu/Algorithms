package ch1_1;

public class Ex03 {
    public static void main(String[] args) {
        int len = args.length;
        if (len != 3) {
            System.out.println("not enough arguments");
            return;
        }
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);
        if (i1 == i2 && i2 == i3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}