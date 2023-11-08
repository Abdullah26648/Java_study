package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();

        if (num >= 0) {
            if (num < 10) {
                System.out.println("Normalsin!");

            } else System.out.println("Buyuksun!");

        } else {
            if (num > -10) {
                System.out.println("Negatifsin!");

            } else {
                System.out.println("Cok Negatifsin!");
            }
        }
    }
}
