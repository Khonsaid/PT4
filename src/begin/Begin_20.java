package begin;

import java.util.Scanner;

public class Begin_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double s = Math.sqrt(Math.pow((x1 - x),2) + Math.pow((y1 - y),2));

        System.out.println(s);
    }
}
