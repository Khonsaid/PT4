package integer;

import java.util.Scanner;

public class Integer_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int min = sec / 60;
        int hours = min / 60;
        System.out.println(hours);
    }
}
