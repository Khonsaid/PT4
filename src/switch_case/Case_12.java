package switch_case;

import java.util.Scanner;

public class Case_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementNumber = scanner.nextInt();
        double elementValue = scanner.nextDouble();
        double r = 0, d = 0, l = 0, s = 0;

        switch (elementNumber) {
            case 1 -> {
                r = elementValue;
                d = 2 * r;
                l = 2 * 3.14 * r;
                s = 3.14 * Math.pow(r, 2);
            }
            case 2 -> {
                d = elementValue;
                r = d / 2;
                l = 2 * 3.14 * r;
                s = 3.14 * Math.pow(r, 2);
            }
            case 3 -> {
                l = elementValue;
                r = l / (2 * 3.14);
                s = 3.14 * Math.pow(r, 2);
                d = 2 * r;
            }
            case 4 -> {
                s = elementValue;
                r = Math.sqrt(s / 3.14);
                l = 2 * 3.14 * r;
                d = 2 * r;
            }
        }
        System.out.printf("%.2f %.2f %.2f %.2f", r, d, l, s);
    }
}
