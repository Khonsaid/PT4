package for_i;

import java.util.Scanner;

public class For_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
