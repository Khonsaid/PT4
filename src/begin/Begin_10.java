package begin;

import java.util.Scanner;

public class Begin_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double kva = Math.pow(a,2);
        double kvb = Math.pow(b,2);
        double kop = kva * kvb;
        double yig = kva + kvb;

        System.out.println(yig);
        System.out.println(kop);
        System.out.println(kva);
        System.out.println(kvb);
    }
}
