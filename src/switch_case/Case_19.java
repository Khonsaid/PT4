package switch_case;

import java.util.Scanner;

public class Case_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int yil = year - 1983;
        int yilQol = yil % 60;
        int rang = yilQol / 12;
        int hayvon = yilQol % 12;
        switch (rang) {
            case 4 -> System.out.print("qora ");
            case 0 -> System.out.print("yashil ");
            case 1 -> System.out.print("qizil ");
            case 2 -> System.out.print("sariq ");
            case 3 -> System.out.print("oq ");
        }
        switch (hayvon) {
            case 1 -> System.out.print("sichqon");
            case 2 -> System.out.print("sigir");
            case 3 -> System.out.print("yo'bars");
            case 4 -> System.out.print("quyon");
            case 5 -> System.out.print("ajdar");
            case 6 -> System.out.print("ilon");
            case 7 -> System.out.print("ot");
            case 8 -> System.out.print("qoy");
            case 9 -> System.out.print("maymun");
            case 10 -> System.out.print("tovuq");
            case 11 -> System.out.print("it");
            case 12 -> System.out.print("tongiz");
        }
    }
}
