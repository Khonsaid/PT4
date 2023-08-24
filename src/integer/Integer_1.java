package integer;

import java.util.Scanner;

public class Integer_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int result = line / 100;
        System.out.println(result);
    }
}
