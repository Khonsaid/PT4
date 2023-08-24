package integer;

import java.util.Scanner;

public class Integer_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ten = number / 10;
        int one = number % 10;
        System.out.println(ten);
        System.out.println(one);
    }
}
