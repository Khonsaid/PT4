package if_else;

import java.util.Scanner;

public class Shart_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double max;
        double min;
        double max2;

        if (a >= b & a >= c) max = a;
        else if (b >= a && b >= c) max = b;
        else max = c;


        if (a <= b & a <= c) min = a;
        else if (b <= a && b <= c) min = b;
        else min = c;

        max2 = a + b + c - max - min;

        System.out.println(max + max2);
    }
}
