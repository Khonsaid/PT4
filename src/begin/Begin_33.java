package begin;

import java.util.Scanner;

public class Begin_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double y = scanner.nextDouble();

        double price = a / x;
        double kg = y * price;
        System.out.println(price);
        System.out.println("y= " + kg);
    }
}
