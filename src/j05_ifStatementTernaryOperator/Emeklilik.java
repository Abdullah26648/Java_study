package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class Emeklilik {
    public static void main(String[] args) {
        /*
        TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcının cinsiyeti Kadinsa:K, Erkekse:E olarak giriniz: ");
        char cinsiyet = input.next().charAt(0);
        System.out.print("Kullanıcının yasini giriniz: ");
        int yas = input.nextInt();
        System.out.print("Kullanıcının prim gununu giriniz: ");
        int primGun = input.nextInt();

        String emeklilikDurumu = (cinsiyet == 'K' && yas > 60 && primGun > 6000) ? "Emeklisin" : (cinsiyet == 'E' && yas > 65 && primGun > 7000) ? "Emeklisin" : "Emekli olamassin";

        int kalanYil = (cinsiyet == 'K') ? yas - 60 : (cinsiyet == 'E') ? yas - 65 : 0;

        int kalanPrimGun = (cinsiyet == 'K') ? primGun - 6000 : (cinsiyet == 'E') ? primGun - 7000 : 0;

        System.out.println("Emeklilik Durumu: " + emeklilikDurumu);
        System.out.println("Kalan Yıl: " + kalanYil);
        System.out.println("Kalan Prim Günü: " + kalanPrimGun);
    }
}