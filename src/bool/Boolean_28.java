package bool;

import java.util.Scanner;

public class Boolean_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        boolean k1 = x > 0 && y > 0;
        boolean k2 = x < 0 && y < 0;
        boolean result = k1 || k2;
        System.out.println(result);
    }
}
