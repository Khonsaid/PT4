package begin;

import java.util.Scanner;

public class Begin_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double d = a1 * b2 - a2 * b1;
        double x = (c1 * b2 - c2 * b1) / d;
        double y = (a1 * c2 - a2 * c1) / d;

        System.out.println(x);
        System.out.println(y);
    }
}
