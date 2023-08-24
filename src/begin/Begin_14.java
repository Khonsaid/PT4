package begin;

import java.util.Scanner;

public class Begin_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        final double PI = 3.14;

        double r = l / (2 * PI);
        double s = PI * Math.pow(r,2);

        System.out.println(r);
        System.out.println(s);
    }
}
