package if_else;

import java.util.Scanner;

public class Shart_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            a = 0;
            b = 0;
            System.out.println(a);
            System.out.println(b);
        } else {
            int max = 0;
            if (a > b) {
                max = a;
                b = a;
                System.out.println(a);
                System.out.println(b);
            } else {
                max = b;
                a = b;
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
