package begin;

import java.util.Scanner;

public class Begin_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        y = 4 * Math.pow((x - 3), 6) - 7 * Math.pow((x - 3), 3) + 2;
        System.out.println(y);
    }
}
