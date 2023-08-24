package if_else;

import java.util.Scanner;

public class Shart_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x < -2 || x > 2) System.out.println(2 * x);
        else System.out.println(-3 * x);
    }
}
