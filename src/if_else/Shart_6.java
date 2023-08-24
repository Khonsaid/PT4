package if_else;

import java.util.Scanner;

public class Shart_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double max = 0;

        if (a > b) max = a;
        else max = b;
        System.out.println(max);
    }
}
