package begin;

import java.util.Scanner;

public class Begin_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double kva = Math.abs(a);
        double kvb = Math.abs(b);
        double kop = kva * kvb;
        double yig = kva + kvb;

        System.out.println(yig);
        System.out.println(kop);
        System.out.println(kva);
        System.out.println(kvb);
    }
}
