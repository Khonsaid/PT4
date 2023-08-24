package begin;

import java.util.Scanner;

public class Begin_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double s1 = Math.PI * Math.pow(r1,2);
        double s2 = Math.PI * Math.pow(r2,2);
        double s3 = (s1 - s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
