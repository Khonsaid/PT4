package bool;

import java.util.Scanner;

public class Boolean_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int dx = Math.abs(x1-x2);
        int dy = Math.abs(y1-y2);

        boolean shox = (dx == 1 && dy == 0) ||
                (dx == 0 && dy == 1) ||
                (dx == 1 && dy == 1);
        System.out.println(shox);
    }
}
