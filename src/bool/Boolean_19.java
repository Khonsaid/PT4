package bool;

import java.util.Scanner;

public class Boolean_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean aJuft = a % 2 == 0;
        boolean bJuft = b % 2 == 0;
        boolean cJuft = c % 2 == 0;


        boolean qaramaQarshi = (aJuft && bJuft && a + b == 0) ||
                (aJuft && bJuft && a + c == 0) ||
                (bJuft && cJuft && b + c == 0);
        System.out.println(qaramaQarshi);
    }
}
