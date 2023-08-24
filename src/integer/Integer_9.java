package integer;

import java.util.Scanner;

public class Integer_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = num / 100;
        System.out.println(digit);
    }
}
