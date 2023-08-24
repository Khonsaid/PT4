package switch_case;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int onlik = n / 10;
        int birlik = n % 10;
        switch (onlik) {
            case 1 -> System.out.print("o'n ");
            case 2 -> System.out.print("yigirma ");
            case 3 -> System.out.print("o'ttiz ");
            case 4 -> System.out.print("qirq ");
            case 5 -> System.out.print("ellik ");
            case 6 -> System.out.print("oltmish ");
            case 7 -> System.out.print("yetmish ");
            case 8 -> System.out.print("sakson ");
            case 9 -> System.out.print("qo'qson ");
        }
        switch (birlik) {
            case 1 -> System.out.println("bir");
            case 2 -> System.out.println("ikki");
            case 3 -> System.out.println("uch");
            case 4 -> System.out.println("to'rt");
            case 5 -> System.out.println("besh");
            case 6 -> System.out.println("olti");
            case 7 -> System.out.println("yetti");
            case 8 -> System.out.println("sakkiz");
            case 9 -> System.out.println("to'qqiz");
        }
    }
}
