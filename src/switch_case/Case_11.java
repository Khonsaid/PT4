package switch_case;

import java.util.Scanner;

public class Case_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char direction = scanner.next().charAt(0);
        int cmd1 = scanner.nextInt();
        int cmd2 = scanner.nextInt();
        int index = 0;
        switch (direction) {
            case 's':
                index = 0;
                break;
            case 'j':
                index = 1;
                break;
            case 'q':
                index = 2;
                break;
            case 'g':
                index = 3;
                break;
        }
        switch (cmd1) {
            case 1:
                index = (index + 3) % 4;
                break;

            case -1:
                index = (index + 1) % 4;
                break;

            case 2:
                index = (index + 2) % 4;
                break;
        }

        switch (cmd2) {
            case 1:
                index = (index + 3) % 4;
                break;

            case -1:
                index = (index + 1) % 4;
                break;

            case 2:
                index = (index + 2) % 4;
                break;
        }
        switch (index) {
            case 's':
                System.out.println("s");
                break;
            case 'j':
                System.out.println("j");
                break;
            case 'q':
                System.out.println("q");
                break;
            case 'g':
                System.out.println("g");
                break;
        }
    }
}
