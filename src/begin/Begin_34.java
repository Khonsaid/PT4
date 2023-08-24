package begin;

import java.util.Scanner;

public class Begin_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double y = scanner.nextDouble();
        double b = scanner.nextDouble();

        double chocolate = a / x;
        double candy = b / y;

        System.out.println(chocolate);
        System.out.println(candy);
        System.out.println(chocolate / candy);
    }
}
