package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Çiftlikteki hayvanların ayaklarının toplam sayısını bulalım.");
        System.out.println("Çiftlikteki bulunan hayvanların miktarını giriniz.");

        System.out.print("Çiftlikteki inek miktarını girin: ");
        int inekMiktar = input.nextInt();

        System.out.print("Çiftlikteki koyun miktarını girin: ");
        int koyunMiktar = input.nextInt();

        System.out.print("Çiftlikteki tavuk miktarını girin: ");
        int tavukMiktar = input.nextInt();

        int toplamAyakSayisi = (inekMiktar * 4) + (koyunMiktar * 4) + (tavukMiktar * 2);

        System.out.println("Çiftlikteki hayvanların ayak toplamı: " + toplamAyakSayisi);
    }
}