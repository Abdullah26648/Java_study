package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz (km): ");
        int mesafe = scanner.nextInt();
        System.out.println("Ortalama hızı giriniz(km/h): ");
        int hiz = scanner.nextInt();
        double sure = mesafe / hiz;
        System.out.println("Varis sureniz yaklasik : " + sure + " saattir");
    }
}
