package j08_Loops.Homeworks2;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100 arasındaki pc'nin atadığı tamsayıyı kullanıcıya tahmin ettirip tahmin sayısını print eden code create ediniz.
         */
        System.out.println("   ***   Task06   ***   ");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int dtahmin = random.nextInt(100) + 1;
        int tahminsayisi = 0;
        int tahmin;
        do {
            System.out.print("agam tahmin giresen: ");
            tahmin = input.nextInt();
            tahminsayisi++;
            System.out.print(tahmin != dtahmin && tahmin<dtahmin?"tutmadi agam, bi daha yuksek bir sayi dene: ":(tahmin==dtahmin?"":"tutmadi agam, bi daha dusuk bir sayi dene: "));
        } while (tahmin != dtahmin);
        System.out.println("tebriks\n"+"tahminsayisi = " + tahminsayisi);
    }
}