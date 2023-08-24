package switch_case;

import java.util.Scanner;

public class Case_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month) {
            case 1 -> {
                if (day > 19) System.out.println("qovga");
                else System.out.println("echki");
            }
            case 2 -> {
                if (day > 18) System.out.println("baliq");
                else System.out.println("qovga");
            }
            case 3 -> {
                if (day > 20) System.out.println("qo'y");
                else System.out.println("baliq");
            }
            case 4 -> {
                if (day > 19) System.out.println("buzoq");
                else System.out.println("qo'y");
            }
            case 5 -> {
                if (day > 20) System.out.println("egizaklar");
                else System.out.println("buzoq");
            }
            case 6 -> {
                if (day > 21) System.out.println("qisqichbaqa");
                else System.out.println("egizaklar");
            }
            case 7 -> {
                if (day > 22) System.out.println("arslon");
                else System.out.println("qisqichbaqa");
            }
            case 8 -> {
                if (day > 22) System.out.println("parizod");
                else System.out.println("arslon");
            }
            case 9 -> {
                if (day > 22) System.out.println("tarozi");
                else System.out.println("parizod");
            }
            case 10 -> {
                if (day > 22) System.out.println("chayon");
                else System.out.println("tarozi");
            }
            case 11 -> {
                if (day > 22) System.out.println("o'qotar");
                else System.out.println("chayon");
            }
            case 12 -> {
                if (day > 21) System.out.println("echki");
                else System.out.println("o'qotar");
            }
        }
    }
}
