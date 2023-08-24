package bool;

import java.util.Scanner;

public class Boolean_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int yuzlarXonasi = a / 100;
        int onlaarXonasi = (a / 10) % 10;
        int birlarXonasi = a % 10;

        boolean xarXil = yuzlarXonasi != onlaarXonasi &&
                yuzlarXonasi != birlarXonasi &&
            onlaarXonasi != birlarXonasi;
        System.out.println(xarXil);
        System.out.println(yuzlarXonasi);
        System.out.println(onlaarXonasi);
        System.out.println(birlarXonasi);
    }
}
