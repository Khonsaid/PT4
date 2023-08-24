package bool;

import java.util.Scanner;

public class Boolean_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean A = a % 2 != 0;
        boolean B = b % 2 != 0;
        boolean result = (A && !B) || (!A && B);
        System.out.println(result);
    }
}
