package bool;

import java.util.Scanner;

public class Boolean_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        boolean b = (x + y) % 2 == 0;
        boolean b2 = (x1 + y1) % 2 == 0;
        boolean may = b == b2;
        System.out.println(may);
    }
}
