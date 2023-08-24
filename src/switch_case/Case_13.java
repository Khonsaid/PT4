package switch_case;

import java.util.Scanner;

public class Case_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementNumber = scanner.nextInt();
        double elementValue = scanner.nextDouble();
        double a = 0, c = 0, h = 0, s = 0;
        switch (elementNumber) {
            case 1 -> {
                a = elementValue;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = (c * h) / 2;
            }
            case 2 -> {
                c = elementValue;
                a = c / Math.sqrt(2);
                h = c / 2;
                s = (c * h) / 2;
            }
            case 3 -> {
                h = elementValue;
                c = h * 2;
                a = c / Math.sqrt(2);
                s = (c * h) / 2;
            }
            case 4 -> {
                s = elementValue;
                h = (s * 2) / s;
                c = h * 2;
                a = c / Math.sqrt(2);
            }
        }
        System.out.printf("%.2f %.2f %.2f %.2f", a, c, h, s);
    }
}
