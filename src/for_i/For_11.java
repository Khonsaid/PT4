package for_i;

import java.util.Scanner;

public class For_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = n; i <= 2 * n; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
