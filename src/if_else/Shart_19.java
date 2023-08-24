package if_else;

import java.util.Scanner;

public class Shart_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a == b && b == c) System.out.println(4);
        else if (a == b && b == d) System.out.println(3);
        else if (a == d && d == c) System.out.println(2);
        else if (b == d && d == c) System.out.println(1);
    }
}
