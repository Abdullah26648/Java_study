package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1

            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        Integer sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.print(i == j ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}