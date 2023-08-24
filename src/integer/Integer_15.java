package integer;

import java.util.Scanner;

public class Integer_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit1 = num % 10;
        int digit2 = (num / 10) % 10;
        int digit3 = num / 100;
        int result = digit2 * 100 + digit3 * 10 + digit1;
        System.out.println(result);
    }
}
