package switch_case;

import java.util.Scanner;

public class Case_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ten = num / 10;
        int one = num % 10;
        if (10 <= num && num <= 40) {
            switch (ten) {
                case 1 -> System.out.println("on ");
                case 2 -> System.out.print("yigirma ");
                case 3 -> System.out.print("ottiz ");
                case 4 -> System.out.print("qirq ");
            }
            switch (one) {
                case 1 -> System.out.print("bit ");
                case 2 -> System.out.print("ikki ");
                case 3 -> System.out.print("uch ");
                case 4 -> System.out.print("tort ");
                case 5 -> System.out.print("besh ");
                case 6 -> System.out.print("olti ");
                case 7 -> System.out.print("yeti ");
                case 8 -> System.out.print("sakiz ");
                case 9 -> System.out.print("toqiz ");
            }
            System.out.println("ta masala");
        } else {
            System.out.println("10 - 40 oraliqdagi sonni kiriting");
        }
    }
}
