package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*Task->
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Saat ve dakika miktarini ogrenmek istediginiz saniyeyi giriniz: ");
        int saniye = input.nextInt();
        int dk = saniye / 60 ;
        int saat = saniye / 3600;
        System.out.println("Girdiginiz " + saniye + " saniye ayni zamanda " + dk + " dakika ve " + saat + " saattir.") ;


    }
}
