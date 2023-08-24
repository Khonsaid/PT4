package switch_case;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fasil = scanner.nextInt();
        switch (fasil) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Qish"); break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Bahor"); break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yoz"); break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Kuz"); break;
            default:
                System.out.println("Boshqa son kiriting");
        }
    }
}
