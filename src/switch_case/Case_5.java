package switch_case;

import java.util.Scanner;

public class Case_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int amal = scanner.nextInt();

        switch (amal) {
            case 1 -> System.out.println(a+b);
            case 2 -> System.out.println(a-b);
            case 3 -> System.out.println(a/b);
            case 4 -> System.out.println(a*b);
        }
    }
}
