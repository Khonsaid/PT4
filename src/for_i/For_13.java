package for_i;

import java.util.Scanner;

public class For_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += 1.0 - 0.1 * n;
//        }

        for (int i = 0; i < n; i++) {
            sum += Math.pow(-1, i) * (1.0 + 0.1 * (i + 1));
        }

        System.out.println(sum);
    }
}

