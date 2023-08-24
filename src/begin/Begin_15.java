package begin;

import java.util.Scanner;

public class Begin_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        final double PI = 3.14;

        double r = Math.sqrt(PI / s) ;
        double l = 2 * PI * r;
        double d = r * 2;

        System.out.println(r);
        System.out.println(l);
        System.out.println(d);
    }
}
