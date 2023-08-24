package begin;

import java.util.Scanner;

public class Begin_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double P = a + b + c;

        System.out.println(c);
        System.out.println(P);
    }
}
