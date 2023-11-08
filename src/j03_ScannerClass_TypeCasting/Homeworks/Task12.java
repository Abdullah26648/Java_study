package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı print eden code create ediniz
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aldiginiz urunun fiyatini giriniz : ");
        double para = scanner.nextDouble();

        if (para <= 0) {
            System.out.println("Gecerli bir fiyat giriniz");
        }
        else {
            double kdvFiyat1 = (para * 0.18) + para;
            double kdvFiyat2 = (para * 0.08) + para;

            if (para >= 1000) {
                System.out.println("Odemeniz gereken tutar : " + kdvFiyat2);
            } else {
                System.out.println("Odemeniz gereken tutar : " + kdvFiyat1);
            }
        }

    }
}
