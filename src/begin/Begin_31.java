package begin;

import java.util.Scanner;

public class Begin_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tF = scanner.nextDouble();

        double tC = (tF - 32) * 5 / 9;
        System.out.println(tC);
    }
}
