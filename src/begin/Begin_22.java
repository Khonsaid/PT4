package begin;

import java.util.Scanner;

public class Begin_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = a;
        a = b;
        b = c;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
