package bool;

import java.util.Scanner;

public class Boolean_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int yuzlarXonasi = a / 100;
        int onlarXonasi = (a / 10) % 10;
        int birlarXonasi = a % 10;

        boolean osuvchi = yuzlarXonasi > onlarXonasi && onlarXonasi > birlarXonasi;
        boolean kamayuvchi = yuzlarXonasi < onlarXonasi && onlarXonasi < birlarXonasi;
        boolean result = osuvchi || kamayuvchi;
        System.out.println(result);

    }
}
