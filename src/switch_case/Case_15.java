package switch_case;

import java.util.Scanner;

public class Case_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCount = scanner.nextInt();
        int mType = scanner.nextInt();
        if (6 <= nCount && nCount <= 14) {
            switch (nCount) {
                case 6 -> System.out.print("olti ");
                case 7 -> System.out.print("yetti ");
                case 8 -> System.out.print("sakkiz ");
                case 9 -> System.out.print("toqqiz ");
                case 10 -> System.out.print("on ");
                case 11 -> System.out.print("valet ");
                case 12 -> System.out.print("dama ");
                case 13 -> System.out.print("qirol ");
                case 14 -> System.out.print("tuz ");
            }
            switch (mType) {
                case 1 -> System.out.println("gisht");
                case 2 -> System.out.println("olma");
                case 3 -> System.out.println("chillak");
                case 4 -> System.out.println("qarga");
            }
        } else System.out.println("6 - 14 son oraliqda kiriting");
    }
}
