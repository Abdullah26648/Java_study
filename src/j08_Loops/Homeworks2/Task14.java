package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("EBOB ve EKOK değerlerini öğreneceğimiz 2 tam sayı giriniz.");
        System.out.print("İlk sayı: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayı: ");
        int s2 = scanner.nextInt();

        // EBOB ve EKOK hesaplama işlemleri
        int ebob = 0;
        int ekok = 0;
        int sayi1 = s1;
        int sayi2 = s2;

        // EBOB hesaplama
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2) {
                sayi1 -= sayi2; // Öklidyen Algoritma'nın bir uygulamasını temsil eder. İki sayı arasındaki farkı hesaplayarak, en büyük ortak böleni bulur.
            } else {
                sayi2 -= sayi1;
            }
        }
        ebob = sayi1;

        // EKOK hesaplama
        ekok = (s1 * s2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}