package if_else;

import java.util.Scanner;

public class Shart_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        if (a > 0) a++;
        else if (a == 0) a += 10;
        else a -= 2;
        System.out.println(a);
    }
}
