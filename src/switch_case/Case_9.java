package switch_case;

import java.util.Scanner;

public class Case_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10 -> {
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            }
            case 4, 6, 9, 11 -> {
                if (day < 30) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            }
            case 12 -> {
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    month = 1;
                }
            }
            case 2 -> {
                if (day < 28) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            }
        }
        System.out.println(day + " " + month);
    }
}

//if (day == 31) {
//            if (month == 12) {
//                day = 1;
//                month = 1;
//            } else {
//                switch (month) {
//                    case 1, 3, 5, 7, 8, 10 -> {
//                        day = 1;
//                        month++;
//                    }
//                }
//            }
//        } else if (day == 28 && month == 2) {
//            day = 1;
//            month = 3;
//        } else if (day == 30) {
//            switch (month) {
//                case 4, 6, 9, 11 -> {
//                    day = 1;
//                    month++;
//                }
//            }
//        } else day++;
//        System.out.println(day + " " + month);
