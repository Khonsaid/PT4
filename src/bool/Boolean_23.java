package bool;

import java.util.Scanner;

public class Boolean_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int yuz = a / 100;
        int bir = a % 10;

        boolean birXil = yuz == bir;
        System.out.println(birXil);

    }
}


//int son = ...; // uch xonali son
//
//// Sonni raqamlarga ajratish
//int yuzlar = son / 100;
//int onlar = (son / 10) % 10;
//int birlar = son % 10;
//
//// Chapdan o'qish
//int chapdan = yuzlar*100 + onlar*10 + birlar;
//
//// O'ngdan o'qish
//int ongdan = birlar*100 + onlar*10 + yuzlar;
//
//// Solishtirish
//boolean birXil = chapdan == ongdan;
//
//System.out.println(birXil);