package j04_AritmeticOperators;

import java.util.Scanner;

public class Gecme_notu_hesaplama {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.print("1. vize notunuzu giriniz: ");
        int vize1 = deger.nextInt();
        System.out.print("2. vize notunuzu giriniz: ");
        int vize2 = deger.nextInt();
        System.out.print("Final notunuzu giriniz: ");
        int _final = deger.nextInt();
        int gecmeN = (int) (((vize1 + vize2) * 0.3) + (_final * 0.4));
        String durum = "";
        durum = gecmeN > 70 ? (gecmeN>90 ? "Pekiyi": "Iyi") : (gecmeN>50 ? "Orta" : "Kaldiniz");
        System.out.println("Gecme durumunuz: " + durum);
    }
}
