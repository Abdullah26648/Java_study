package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en büyüğünü print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        int sayac = 1;
        int largest = Integer.MIN_VALUE; // Once un buyuk degerini en kucuk integer olarak aliyoruz.

        while (sayac <= 5) {
            System.out.print(sayac + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > largest) {
                largest = sayi; // Burada da en buyuk olani buluyoruz.
            }
            sayac++;
        }
        System.out.println("En büyük sayı: " + largest);
    }
}