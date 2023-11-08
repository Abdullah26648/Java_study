package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        /* Task->
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        double sayi = scanner.nextDouble();

        // Sayının son basamağını elde etmek için ondalık kısmı çıkartın
        int sonBasamak = (int) (sayi * 10) % 10;

        if (sonBasamak >= 5) {
                // Son basamak 5 ve 5'ten büyükse yuvarla
                sayi = Math.ceil(sayi);
                System.out.println("Son basamağı bir üst ondalığa yuvarla: " + sayi);
        } else {
        // Son basamak 5 ve 5'ten küçükse yuvarla
        sayi = Math.floor(sayi);
        System.out.println("Son basamağı bir alt ondalığa yuvarla: " + sayi);
        }
    }
}