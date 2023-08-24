package bool;

import java.util.Scanner;

public class Boolean_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean A = a % 2 != 0;
        boolean B = b % 2 != 0;

        boolean toq = A && B;
        boolean juft = !A && !B;
        boolean result = toq || juft;
        System.out.println(result);
    }
}
