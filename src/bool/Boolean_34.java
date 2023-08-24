package bool;

import java.util.Scanner;

public class Boolean_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean oq = (x + y) % 2 != 0;
        System.out.println(oq);
    }
}
