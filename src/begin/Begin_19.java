package begin;

import java.util.Scanner;

public class Begin_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double wight = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);

        double perimeter = 2 * (wight + height);
        double area = wight * height;

        System.out.println(perimeter);
        System.out.println(area);
    }
}
