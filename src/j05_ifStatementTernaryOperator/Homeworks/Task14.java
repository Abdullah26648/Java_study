package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task14 {

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
        System.out.print("Kullanıcının prim gununu girniz: ");
        int primGun = input.nextInt();
        if (cinsiyet == 'K') {
            if (yas >= 60) {
                if (primGun >= 6000) {
                    System.out.println("Emeklilik kriterlerini karsiladiniz");
                } else {
                    System.out.println("Priminiz " + (6000 - primGun) + " gun kadar eksik");
                }
            } else {
                if (primGun >= 6000) {
                    System.out.println((60 - yas) + " yil sonra emekli olabilirsiniz");
                } else {
                    System.out.println((60 - yas) + " yil sonra emekli olabilirsiniz");
                    System.out.println("Priminiz " + (6000 - primGun) + " gun kadar eksik");
                }
            }
        } else {
            if (yas >= 65) {
                if (primGun >= 7000) {
                    System.out.println("Emeklilik kriterlerini karsiladiniz");
                } else {
                    System.out.println("Priminiz " + (7000 - primGun) + " gun kadar eksik");
                }
            } else {
                if (primGun >= 7000) {
                    System.out.println((65 - yas) + " yil sonra emekli olabilirsiniz");
                } else {
                    System.out.println((65 - yas) + " yil sonra emekli olabilirsiniz");
                    System.out.println("Priminiz " + (7000 - primGun) + " gun kadar eksik");
                }
            }
        }
    }
}