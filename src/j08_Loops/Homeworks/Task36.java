package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harmonik serisini bulmak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        double harmonikToplam = calculateHarmonicSeries(sayi);

        System.out.println(sayi + " sayısının harmonik serisi toplamı: " + harmonikToplam);
    }

    public static double calculateHarmonicSeries(int n) {
        double harmonikToplam = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonikToplam += 1.0 / i;
        }

        return harmonikToplam;
    }
}