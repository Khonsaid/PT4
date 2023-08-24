package begin;

import java.util.Scanner;

public class Begin_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        double s = Math.abs(x2 - x1);

        System.out.println(s);
    }
}
