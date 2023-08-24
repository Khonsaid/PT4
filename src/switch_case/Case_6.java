package switch_case;

import java.util.Scanner;

public class Case_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        double metr = scanner.nextDouble();
        switch (line) {
            case 1 -> System.out.println(metr * 0.1);
            case 2 -> System.out.println(metr * 1000);
            case 3 -> System.out.println(metr * 1);
            case 4 -> System.out.println(metr * 0.001);
            case 5 -> System.out.println(metr * 0.01);
        }
    }
}
