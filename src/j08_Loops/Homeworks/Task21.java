package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        /*
                *
               * *
              * ! *
             * ! ! *
            * ! ! ! *
           * ! ! ! ! *
          * ! ! ! ! ! *
         * * * * * * * *

       şekli print eden code create ediniz.


       */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seklin uzunlugu ne kadar olsun?: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { // Ucgen seklini veren bosluklari bu blokta belirleyip yazdiriyoruz.
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // "*" yoksa "!" burda belirleyip yazdiriyoruz.
                System.out.print((j == i || j == 1 || i == n)?"* ":"! ");
            }
            System.out.println();// Dummy burada (kat gorevlisi)
        }
    }
}