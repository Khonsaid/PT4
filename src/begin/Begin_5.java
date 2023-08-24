package begin;

import java.util.Scanner;

public class Begin_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double V = Math.pow(a,3);
        double S = 6 * Math.pow(a,2);
        System.out.println("Hajmi: " + V);
        System.out.println("Sirti: " + S);
    }
}
