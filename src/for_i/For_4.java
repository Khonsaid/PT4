package for_i;

import java.util.Scanner;

public class For_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        for (int i = 1; i <= 10; i++) {
            double prices = 0;
            prices = price * i;
            System.out.println(i + " kg = " + prices);
        }
    }
}
