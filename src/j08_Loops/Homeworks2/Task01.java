package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        while (toplam<=333) {
            System.out.print("Bir sayi giriniz: ");
            int sayi = sc.nextInt();
            toplam+= sayi;
            sayac++;
        }
        System.out.print("Girdiniz " + sayac + " adet sayinin toplami: " + toplam);
    }
}