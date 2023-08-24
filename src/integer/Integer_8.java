package integer;

import java.util.Scanner;

public class Integer_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit1 = number / 10;
        int digit2 = number % 10;
        int result = digit2 * 10 + digit1;
        System.out.println(result);
    }
}
