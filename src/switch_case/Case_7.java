package switch_case;

import java.util.Scanner;

public class Case_7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        double weight = scanner.nextDouble();
        switch (number){
            case 1 -> System.out.println(weight * 1);
            case 2 -> System.out.println(weight * 0.000001);
            case 3 -> System.out.println(weight * 0.001);
            case 4 -> System.out.println(weight * 1000);
            case 5 -> System.out.println(weight * 0.01);
        }
    }
}
