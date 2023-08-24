package switch_case;

import java.util.Scanner;

public class Case_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case 1 -> System.out.println("dushnba");
            case 2 -> System.out.println("seshanba");
            case 3 -> System.out.println("chorshanba");
            case 4 -> System.out.println("payshanba");
            case 5 -> System.out.println("juma");
            case 6 -> System.out.println("shanba");
            case 7 -> System.out.println("yakshanba");
            default -> System.out.println("1-7 gacha bo'lgan son kiriting");
        }
    }
}
