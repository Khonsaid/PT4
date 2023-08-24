package bool;

import java.util.Scanner;

public class Boolean_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean result = a > 2 & b <= 3;
        System.out.println(result);
    }
}
