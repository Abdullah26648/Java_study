package j08_Loops.Homeworks3;

import java.util.Scanner;

public class Task07 {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiği ana kadar aldigi toplam yolu ve
    yere vurma sayısını print eden  do while code blogu create ediniz.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Topun bırakıldığı ilk yüksekliği (m) giriniz: ");
        double yukseklik = scan.nextDouble();
        int kere = 0;
        double yol = 0;

        if (yukseklik > 1) {
            do {
                yol += (yukseklik > 1 ? (yukseklik+(yukseklik * (3.0 / 4.0))):(yol-1));
                yukseklik *= (3.0 / 4.0);
                kere++;
            } while (yukseklik > 1);
            System.out.print("Attığınız top " + kere + " kez zıpladı ve " + yol + "m yol kat etti.");
        } else {
            System.out.print("Yükseklik 1 metrenin altında olamaz!!!");
        }
    }
}
