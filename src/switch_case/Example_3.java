package switch_case;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yilFasli = scanner.nextInt();
        switch (yilFasli) {
            case 1:
                System.out.println("1.Dekabr 2.Yanvar 3.Fevral"); break;
            case 2:
                System.out.println("1.Mart 2.Aprel 3.May"); break;
            case 3:
                System.out.println("1.Iyun 2.Iyul 3.Avgust"); break;
            case 4:
                System.out.println("1.Sentyabr 2.Oktyabr 3.Noyabr"); break;
        }
    }
}
