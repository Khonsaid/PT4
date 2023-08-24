package bool;

import java.util.Scanner;

public class Boolean_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        boolean k = x > 0 && y < 0;
        System.out.println(k);
    }
}
