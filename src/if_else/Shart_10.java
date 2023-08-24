package if_else;

import java.util.Scanner;

public class Shart_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            a = 0;
            b = 0;
        } else {
            int count = a + b;
            a = count;
            b = count;
        }
        System.out.println(a);
        System.out.println(b);

        //==========================================================

//        int a = scanner.nextInt();//3
//        int b = scanner.nextInt();//5
//
//        if (a != b) {
//            a = a + b;
//        } else {
//            a = 0;
//        }
//        b = a;
//
//        System.out.println(a);
//        System.out.println(b);
    }
}
