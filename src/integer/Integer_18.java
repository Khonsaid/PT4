package integer;

import java.util.Scanner;

public class Integer_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int thousand = num / 1000;
        int one = thousand % 10;
        System.out.println(one);
    }
}
