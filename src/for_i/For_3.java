package for_i;

import java.util.Scanner;

public class For_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = b - a - 1;
        for (int i = b - 1; i > a; i--) {
            System.out.print(i + " ");
        }
    }
}
