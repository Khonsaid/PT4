package bool;

import java.util.Scanner;

public class Boolean_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean juft = a % 2 != 0;
        boolean uch = a >= 100 && a < 1000;
        boolean result = juft && uch;
        System.out.println(result);
    }
}
