package switch_case;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oy = in.nextInt();
        switch (oy) {
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Iyun");
            case 7 -> System.out.println("Iyul");
            case 8 -> System.out.println("Avgust");
            case 9 -> System.out.println("Sentyabr");
            case 10 -> System.out.println("Oktyabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Deksbr");
        }
    }
}
