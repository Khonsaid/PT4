package if_else;

import java.util.Scanner;

public class Shart_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (x > 0) System.out.println(2 * Math.sin(x));
        else if (x <= 0) System.out.println(6 - x);
    }
}
