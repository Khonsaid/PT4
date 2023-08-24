package if_else;

import java.util.Scanner;

public class Shart_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double min;
        double max;

        if (a >= b && a >= c) max = a;
        else if (b >= a && b >= c) max = b;
        else max = c;

        if (a <= b && a <= c) min = a;
        else if (b <= a && b<= c) min = b;
        else min = c;

        System.out.println(min);
        System.out.println(max);
    }
}
