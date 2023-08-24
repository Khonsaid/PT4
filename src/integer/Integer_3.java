package integer;

import java.util.Scanner;

public class Integer_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int result = size / 1024;
        System.out.println(result);
    }
}
