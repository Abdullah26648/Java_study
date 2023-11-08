package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız : ");
        String ad = scanner.next();

        System.out.print("Soyadınız : ");
        String soyad = scanner.next();

        System.out.print("Yaşınız : ");
        int yaş = scanner.nextInt();

        System.out.print("Kilo : ");
        int kilo = scanner.nextInt();

        System.out.print("Boy : ");
        int boy = scanner.nextInt();

        System.out.print("Kac ay boyunca salona devam edeceksiniz : ");
        int ay = scanner.nextInt();
        int tutar = ay*20 ;

        System.out.println("Salona devam edeceginiz "+ay+" icin odemeniz gereken tutar : "+tutar+"$");

    }
}
