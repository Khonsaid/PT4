package integer;

import java.util.Scanner;

public class Integer_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit1 = num % 10;
        int digit2 = (num / 10) % 10;
        System.out.println(digit1 + " " + digit2);
    }
}
