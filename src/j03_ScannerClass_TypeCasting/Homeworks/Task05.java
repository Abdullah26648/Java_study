package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dort islem sonucunu ogrenmek istediginiz 2 tam sayi giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam = sayi1 + sayi2;
        int carpma = sayi1 * sayi2;
        if (sayi1>sayi2) {
            int cikarma = sayi1 - sayi2;
            ;
            System.out.println("Sayilarin farki : "+ cikarma);
        }
        else if (sayi1<sayi2) {
            int cikarma = sayi2 - sayi1;
            ;
            System.out.println("Sayilarin farki : "+ cikarma);
        }

        if (sayi1>sayi2) {
            int bolme = sayi1 / sayi2;
            ;
            System.out.println("Sayilarin bolme sonucu : "+ bolme);
        }
        else if (sayi1<sayi2) {
            int bolme = sayi2 / sayi1;
            ;
            System.out.println("Sayilarin bolume sonucu : "+ bolme);
        }
        System.out.println("Girilen sayilarin toplami: "+toplam+" Carpimi: "+carpma);



    }

}
