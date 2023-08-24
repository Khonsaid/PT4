package begin;

import java.util.Scanner;

public class Begin_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double S = a * b;
        double P = 2 * (a + b);
        System.out.println("Peremetri: " + P);
        System.out.println("Yuzasi: " + S);
    }
}
