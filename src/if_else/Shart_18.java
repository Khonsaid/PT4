package if_else;

import java.util.Scanner;

public class Shart_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b) System.out.println(3);
        else if (a == c) System.out.println(2);
        else System.out.println(1);

    }
}
