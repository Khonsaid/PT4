package for_i;

import java.util.Scanner;

public class For_0_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        double factorial = 1;
        double sinx = 0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            double powX = Math.pow(x, 2 * i + 1);
            double coefficient = Math.pow(-1, i) / factorial;
            sinx += coefficient * powX;
        }
        System.out.println("sin(" + x + ") = " + sinx);
    }
}
