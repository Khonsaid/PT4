package bool;

import java.util.Scanner;

public class Boolean_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean r1 = x1 == x2 && y1 != y2;
        boolean r2 = y1 == y2 && x1 != x2;

        boolean result = r1 || r2;
        System.out.println(result);
    }
}
