package begin;

import java.util.Scanner;

public class Begin_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double temp = b;
        b = a;
        a = c;
        c = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
