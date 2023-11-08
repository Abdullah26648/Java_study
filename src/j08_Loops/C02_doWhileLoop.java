package j08_Loops;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        // task-> girilen 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        System.out.print("Sayiyi giriniz: ");
        do {
            sayi = scanner.nextInt();
            System.out.print("Olmadi aga gene gir !!!");
        } while (sayi>13);
        System.out.println("olaaa kazandınız :) ");
    }
}
