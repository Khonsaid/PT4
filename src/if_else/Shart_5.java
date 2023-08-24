package if_else;

import java.util.Scanner;

public class Shart_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int tempPlus = 0;
        int tempMinus = 0;

        if (a > 0) tempPlus++;
        if (b > 0) tempPlus++;
        if (c > 0) tempPlus++;

        if (a < 0) tempMinus++;
        if (b < 0) tempMinus++;
        if (c < 0) tempMinus++;

        System.out.println(tempPlus);
        System.out.println(tempMinus);
    }
}
