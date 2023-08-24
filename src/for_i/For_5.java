package for_i;

import java.util.Scanner;

public class For_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        for (double i = 0.1; i <= 1; i+=0.1) {
            double prices;
            prices = price * i;
            System.out.println(i + " kg = " + prices);
        }
    }
}
