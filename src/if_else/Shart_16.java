package if_else;

import java.util.Scanner;

public class Shart_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean tar = a < b && b < c;

        if (tar) {
            a *= 2;
            b *= 2;
            c *= 2;
        }else {
            a = -a;
            b = -b;
            c = -c;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
