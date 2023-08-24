package begin;

import java.util.Scanner;

public class Begin_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double ac = Math.abs(a - c);
        double bc = Math.abs(b - c);
        double abc = Math.abs(ac + bc);

        System.out.println(abc);
        System.out.println(ac);
        System.out.println(bc);
    }
}
