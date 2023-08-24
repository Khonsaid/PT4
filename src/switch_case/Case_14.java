package switch_case;

import java.util.Scanner;

public class Case_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementNumber = scanner.nextInt();
        double elementValue = scanner.nextDouble();
        double a = 0, r1 = 0, r2 = 0, s = 0;
        switch (elementNumber) {
            case 1 -> {
                a = elementValue;
                r1 = a * Math.sqrt((double) 3 / 6);
                r2 = r1 * 2;
                s = Math.pow(a, 2) * Math.sqrt((double) 3 / 4);
            }
            case 2 -> {
                r1 = elementValue;
                a = r1 / Math.sqrt((double) 3 / 6);
                r2 = 2 * r1;
                s = Math.pow(a, 2) * Math.sqrt((double) 3 / 4);
            }
            case 3 -> {
                r2 = elementValue;
                r1 = r2 / 2;
                a = r1 / Math.sqrt((double) 3 / 6);
                s = Math.pow(a, 2) * Math.sqrt((double) 3 / 4);
            }
            case 4 -> {
                s = elementValue;
                a = Math.sqrt(s / Math.sqrt((double) 3 / 4));
                r1 = a * Math.sqrt((double) 3 / 6);
                r2 = 2 * r1;
            }
        }
        System.out.printf("%.2f %.2f %.2f %.2f", a, r1, r2, s);
    }
}
