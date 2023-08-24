package bool;

import java.util.Scanner;

public class Boolean_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;
        boolean result = d > 0;
        System.out.println(result);
    }
}
