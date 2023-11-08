package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
        Task->
        * Girilen saati  saniyeye çeviren program yazınız
        * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
        * 1 saat = 3600 saniye
        * 1 dk   = 60 saniye
        *
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Saniye ve dakika miktarini ogrenmek istediginiz saati giriniz");
        int saat = input.nextInt();
        int dk = saat * 60 ;
        int saniye = saat * 3600;
        System.out.println("Girdiginiz " + saat + " saat ayni zamanda " + dk + " dakika ve " + saniye + " saniyedir.") ;
    }

}



























