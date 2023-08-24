package for_i;

import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n = b - a + 1;
        System.out.println(n);
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }

    }
}
