package begin;

import java.util.Scanner;

public class Begin_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double V = a * b * c;
        double S = 2 * (a * b + b * c + a * c);

        System.out.println("hajmi: " + V);
        System.out.println("sirti: " + S);
    }
}
