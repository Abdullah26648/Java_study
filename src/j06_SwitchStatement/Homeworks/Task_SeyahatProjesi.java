package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {
        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

        todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
             İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

        1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

         todo Frankfurt girildiyse,
              örn: girdi= Frankfurt
              case=FRANKFURT:

        Rota = Frankfurt yazdırın.
        Frankfurt km hesabı işlemi yapın.

        son olarak konsolda: Frankfurt 15 Euro         yazsın.
        todo case: KÖLN ise

        "Rota = Köln" yazdırın.
        km hesabına göre işlemi yapınız.

        son olarak konsolda:  Köln   20 Euro             yazsın.



        2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

        case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
        */
        Scanner scanner = new Scanner(System.in);

        // Sabit veriler
        final int KM_BIRIM_FIYAT = 5;
        final int MAX_KISI_SAYISI = 2;

        // Kullanıcıdan rota seçimini al
        System.out.println("Nereye yolculuk etmek istiyorsunuz?");
        System.out.println("Frankfurt : 60 KM");
        System.out.println("Koln : 80 KM");
        System.out.print("Rota seçiniz (Frankfurt/Koln): ");
        String rota = scanner.nextLine().toUpperCase();

        int toplamKm = 0;

        switch (rota) {
            case "FRANKFURT":
                toplamKm = 60;
                break;
            case "KOLN":
                toplamKm = 80;
                break;
            default:
                System.out.println("Geçersiz rota seçimi.");
                return;
        }

        int kisiSayisi = 0;
        System.out.print("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir): ");
        kisiSayisi = scanner.nextInt();

        if (kisiSayisi < 1 || kisiSayisi > MAX_KISI_SAYISI) {
            System.out.println("Geçersiz kişi sayısı.");
            return;
        }

        int biletFiyati = (toplamKm / 20) * KM_BIRIM_FIYAT;
        int toplamTutar = kisiSayisi * biletFiyati;

        System.out.println("Yolculuğunuz: " + rota + " - " + kisiSayisi + " Kişilik");
        System.out.println("Bakiyeniz: " + (kisiSayisi * 50) + " Euro");
        System.out.println("Toplam Tutar: " + toplamTutar + " Euro");
        double paraUstu = (kisiSayisi * 50) - toplamTutar;
        System.out.println("Para Üstü: " + paraUstu + " Euro");
    }
}