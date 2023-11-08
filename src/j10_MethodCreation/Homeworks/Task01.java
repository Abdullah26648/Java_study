package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();
        if (esitMi(sayi1, sayi2)) {
            System.out.println("Girilen iki sayi esittir.");
        } else {
            System.out.println("Girilen iki sayi esit degildir.");
        }

    }

    // İki sayının eşit olup olmadığını kontrol eden metot
    private static boolean esitMi(int sayi1, int sayi2) {
        return  sayi1 == sayi2;

    }//main sonu



}//class sonu
