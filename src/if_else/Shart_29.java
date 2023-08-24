package if_else;

import java.util.Scanner;

public class Shart_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();

        if (son > 0) {
            if (son % 2 != 0) {
                System.out.println(son + " musbat toq son");
            } else {
                System.out.println(son + " musbat juft son");
            }
        } else if (son < 0) {
            if (son % 2 != 0) {
                System.out.println(son + " manfiy toq son");
            } else {
                System.out.println(son + " manfiy juft son");
            }
        } else {
            System.out.println("Son nolga teng");
        }
    }
}
