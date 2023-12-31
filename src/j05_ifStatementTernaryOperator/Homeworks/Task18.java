package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dogdugun gunu girermisin (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Dogdugun ayi girermisin (1-12): ");
        int month = scanner.nextInt();

        String zodiacSign = "";

        if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 20)) {
            zodiacSign = "Koç Burcu";
        } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day >= 1 && day <= 21)) {
            zodiacSign = "Boğa Burcu";
        } else if ((month == 5 && day >= 22 && day <= 31) || (month == 6 && day >= 1 && day <= 22)) {
            zodiacSign = "İkizler Burcu";
        } else if ((month == 6 && day >= 23 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            zodiacSign = "Yengeç Burcu";
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            zodiacSign = "Aslan Burcu";
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            zodiacSign = "Başak Burcu";
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            zodiacSign = "Terazi Burcu";
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
            zodiacSign = "Akrep Burcu";
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            zodiacSign = "Yay Burcu";
        } else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
            zodiacSign = "Oğlak Burcu";
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 19)) {
            zodiacSign = "Kova Burcu";
        } else if ((month == 2 && day >= 20 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {
            zodiacSign = "Balık Burcu";
        } else {
            System.out.println("Gecersiz tarih girisi.");
            return;
        }

        System.out.println("Burcun: " + zodiacSign);
    }
}
