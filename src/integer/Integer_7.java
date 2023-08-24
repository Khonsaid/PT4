package integer;

import java.util.Scanner;

public class Integer_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ten = number / 10;
        int one = number % 10;
        int result = ten + one;
        System.out.println(result);
    }
}
