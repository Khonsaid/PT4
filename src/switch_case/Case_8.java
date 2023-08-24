package switch_case;

import java.util.Scanner;

public class Case_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        if (day == 1) {
            if (month == 1) {
                day = 31;
                month = 12;
            } else {
                switch (month) {
                    case 2 -> {
                        day = 31;
                        month = 1;
                    }
                    case 3 -> {
                        day = 28;
                        month = 2;
                    }
                    case 4 -> {
                        day = 31;
                        month = 3;
                    }
                    case 5 -> {
                        day = 30;
                        month = 4;
                    }
                    case 6 -> {
                        day = 31;
                        month = 5;
                    }
                    case 7 -> {
                        day = 30;
                        month = 6;
                    }
                    case 8 -> {
                        day = 31;
                        month = 7;
                    }
                    case 9 -> {
                        day = 31;
                        month = 8;
                    }
                    case 10 -> {
                        day = 30;
                        month = 9;
                    }
                    case 11 -> {
                        day = 31;
                        month = 10;
                    }
                    case 12 -> {
                        day = 30;
                        month = 11;
                    }
                }
            }
        } else {
            day--;
        }
        System.out.println(day + " " + month);

    }
}
