package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
        Örnek Ekran çıktısı

        *
        * *
        * * *
        * * * *

        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}