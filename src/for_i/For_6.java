package for_i;

import java.util.Scanner;

public class For_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        for (double i = 1.2; i < 2; i += 0.2) {
            double prices = price * i;
            System.out.println(i + " kg = " + prices);
        }
    }
}
