package switch_case;

import java.util.Scanner;

public class Case_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char y = scanner.next().charAt(0);
        int k = scanner.nextInt();
        switch (y) {
            case 's' -> {
                switch (k) {
                    case 0 -> {
                        System.out.println("s");
                    }
                    case 1 -> {
                        System.out.println("q");
                    }
                    case 2 -> {
                        System.out.println("g");
                    }
                }
            }
            case 'j' -> {
                switch (k) {
                    case 0 -> {
                        System.out.println("j");
                    }
                    case 1 -> {
                        System.out.println("g");
                    }
                    case 2 -> {
                        System.out.println("q");
                    }
                }
            }
            case 'q' -> {
                switch (k) {
                    case 0 -> {
                        System.out.println("q");
                    }
                    case 1 -> {
                        System.out.println("j");
                    }
                    case 2 -> {
                        System.out.println("s");
                    }
                }
            }
            case 'g' -> {
                switch (k) {
                    case 0 -> {
                        System.out.println("g");
                    }
                    case 1 -> {
                        System.out.println("s");
                    }
                    case 2 -> {
                        System.out.println("j");
                    }
                }
            }
        }
    }
}
