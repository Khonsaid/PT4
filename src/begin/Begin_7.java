package begin;

import java.util.Scanner;

public class Begin_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double V = 2 * Math.PI * r;
        double S = Math.PI * Math.pow(r,2);

        System.out.println("uzunligi: " + V);
        System.out.println("yuzasi: " + S);
    }
}
