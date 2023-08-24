package if_else;

import java.util.Scanner;

public class Shart_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + " " + b);
    }
}
