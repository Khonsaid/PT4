package integer;

import java.util.Scanner;

public class Integer_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds % 60;
        int hours = seconds % 3600;
        System.out.println(hours);

    }
}
