package switch_case;

import java.util.Scanner;

public class Case_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int ten = year / 10;
        int one = year % 10;
        if (20 <= year && year <= 69) {
            switch (ten) {
                case 2 -> System.out.print("yigirma ");
                case 3 -> System.out.print("ottiz ");
                case 4 -> System.out.print("qirq ");
                case 5 -> System.out.print("ellik");
                case 6 -> System.out.print("oltmish");
            }
            switch (one) {
                case 1 -> System.out.print("bir ");
                case 2 -> System.out.print("ikki ");
                case 3 -> System.out.print("uch ");
                case 4 -> System.out.print("tort ");
                case 5 -> System.out.print("besh ");
                case 6 -> System.out.print("olti ");
                case 7 -> System.out.print("yeti ");
                case 8 -> System.out.print("sakiz ");
                case 9 -> System.out.print("toqiz ");
            }
            System.out.print("yosh");
        } else {
            System.out.println("20 - 69 oraliqdagi sonni kiriting");
        }
    }
}
