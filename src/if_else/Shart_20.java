package if_else;

import java.util.Scanner;

public class Shart_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double minLength = Math.abs(b - a);
        double value = b;

        if (minLength > Math.abs(c - a)) {
            minLength = Math.abs(c - a);
            value = c;
        }

        System.out.println(value + " " + minLength);

    }
}
