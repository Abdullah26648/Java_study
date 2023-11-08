package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
        Örnek Ekran çıktısı
        1  2  3  4  5
        2  4  6  8 10
        3  6  9 12 15
        4  8 12 16 20
        5 10 15 20 25

        5x5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kare carpimi almak istediginiz sayiyi giriniz: ");
        int karecarpimi = scanner.nextInt();
        int genislik = (int) (Math.log10(karecarpimi * karecarpimi) + 1);// Cikabilecek en buyuk sayiyi ve tabiki en genis olanini baz alarak genisligimizi belirliyoruz.
        for (int i = 1; i <= karecarpimi; i++) {
            for (int j = 1; j <= karecarpimi; j++) {
                System.out.printf("%" + genislik + "d ", i * j);// soutf ile belirledigimiz genislik olcusunde ciktimizi yazdiriyoruz.
            }
            System.out.println();
        }
    }
}