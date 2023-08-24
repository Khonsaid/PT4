package switch_case;

import java.util.Scanner;

public class Case_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundred = num / 100;
        int ten = (num / 10) % 10;
        int one = num % 10;

        String nums = null;

        if (100 <= num && num <= 999) {
            switch (hundred) {
                case 1 -> nums = "bir yuz ";
                case 2 -> nums = "ikki yuz ";
                case 3 -> nums = "uch yuz ";
                case 4 -> nums = "tort yuz ";
                case 5 -> nums = "besh yuz ";
                case 6 -> nums = "olti yuz ";
                case 7 -> nums = "yeti yuz ";
                case 8 -> nums = "sakiz yuz ";
                case 9 -> nums = "toqiz yuz ";
            }
            switch (ten) {
                case 0 -> {
                }
                case 1 -> nums += "on ";
                case 2 -> nums += "yigirma ";
                case 3 -> nums += "ottiz ";
                case 4 -> nums += "qirq ";
                case 5 -> nums += "elik ";
                case 6 -> nums += "oltmish ";
                case 7 -> nums += "yetmish ";
                case 8 -> nums += "sakson ";
                case 9 -> nums += "toqson ";
            }
            switch (one) {
                case 0 -> {
                }
                case 1 -> nums += "bir ";
                case 2 -> nums += "ikki ";
                case 3 -> nums += "uch ";
                case 4 -> nums += "tort ";
                case 5 -> nums += "besh ";
                case 6 -> nums += "olti ";
                case 7 -> nums += "yeti ";
                case 8 -> nums += "sakiz ";
                case 9 -> nums += "toqiz ";
            }
        }
        System.out.println(nums);
    }
}
