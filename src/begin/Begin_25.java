package begin;

import java.util.Scanner;

public class Begin_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
        System.out.println(y);
    }
}
