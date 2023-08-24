package integer;

import java.util.Scanner;

public class Integer_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds % 60;
        System.out.println(minutes);
    }
}
