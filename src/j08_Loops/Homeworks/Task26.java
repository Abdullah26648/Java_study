package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        // Task -> verilen bir tam sayının rakamları toplamını print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rakamlarını toplamak istediğiniz bir sayı giriniz: ");
        long sayi = scanner.nextLong(); // long aldim cunku sayi cok buyuk olabilir.
        int toplam = 0;

        String sayistr = String.valueOf(sayi); // Sayiyi string yapiyoruz ki rakamlari teker teker alabilelim.

        for (int i = 0; i < sayistr.length(); i++) {
            int rakam = Character.getNumericValue(sayistr.charAt(i)); // String icinde yakaladigimiz karakterin sayisal degerlerini aliyoruz.
            toplam += rakam; // Yukarida aldigimiz rakamsal degerleri burada toplama ekliyoruz.
        }
        System.out.println("Rakamların toplamı = " + toplam);
    }
}