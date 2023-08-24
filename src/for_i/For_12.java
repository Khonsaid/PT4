package for_i;

import java.util.Scanner;

public class For_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 1;
        for (double i = 1; i <= n; i++) {
            sum *= 1.0 + 0.1 * i;
        }
        System.out.println(sum);
    }
}
//float = s = 1;
//float = k = 1.1f;
//for (int i = 0; i < n; i++) {
//            s *= (k + i / 10f);
//        }