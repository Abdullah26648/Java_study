package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şekliprint eden code create ediniz

         */

        // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz

        // Amele versiyon

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 3; i >=1 ; i--) {
            for (int j = 1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Cincix versiyon

        Scanner scanner = new Scanner(System.in);
        System.out.print("Agam bayrak ne kadar buyuk olsun: ");
        int buyukluk = scanner.nextInt();

        for (int i = 1; i <= buyukluk; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = buyukluk - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}