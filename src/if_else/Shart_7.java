package if_else;

import java.util.Scanner;

public class Shart_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > b) System.out.println(2);
        else if (a < b) System.out.println(1);
    }
}
