package if_else;

import java.util.Scanner;

public class Shart_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double max = 0;
        double min = 0;

        if (a > b) max = a;
        else min = a;

        if (b > a) max = b;
        else min = b;
        System.out.println(max);
        System.out.println(min);
    }
}
