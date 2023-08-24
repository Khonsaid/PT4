package if_else;

import java.util.Scanner;

public class Shart_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x <= 0) System.out.println(-x);
        else if (0 < x && x < 2) System.out.println(Math.pow(x, 2));
        else if (x >= 2) System.out.println(4);
    }
}
