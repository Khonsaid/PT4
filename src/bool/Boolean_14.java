package bool;

import java.util.Scanner;

public class Boolean_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean A = a > 0;
        boolean B = b > 0;
        boolean C = c > 0;
        boolean result = (A && !B && !C) || (!A && B && C) || (!A && !B && C);
        System.out.println(result);
    }
}
