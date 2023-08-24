package for_i;

import java.util.Scanner;

public class For_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println(sum);
    }
}
