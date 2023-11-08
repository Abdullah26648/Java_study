package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false

        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false

        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 üssü olma durumunu kontrol etmek istediginiz bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        boolean ussudur = false;

        if (sayi > 1) {
            for (int i = 1; i <= sayi; i *= 3) {
                if (i == sayi) {
                    ussudur = true;
                    break;
                }
            }
        }

        if (ussudur) {
            System.out.println("Girilen sayı 3'ün üssüdür.");
        } else {
            System.out.println("Girilen sayı 3'ün üssü değildir.");
        }
    }
}