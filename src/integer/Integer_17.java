package integer;

import java.util.Scanner;

public class Integer_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundred = num / 1000;
        int residue = hundred % 10;
        System.out.println(residue);
    }
}
