package bool;

import java.util.Scanner;

public class Boolean_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean juft = a % 2 == 0;
        boolean ikki = a >= 10 && a < 100;
        boolean result = juft && ikki;
        System.out.println(result);
    }
}
