package switch_case;

import java.util.Scanner;

public class Case_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oy = scanner.nextInt();
        switch (oy) {
            case 12,1,2 -> System.out.println("qish");
            case 3,4,5 -> System.out.println("bahor");
            case 6,7,8 -> System.out.println("yoz");
            case 9,10,11 -> System.out.println("kuz");
        }
    }
}
