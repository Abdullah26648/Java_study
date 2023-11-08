package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task33 {
    /*
    Bir sayının mükemmel olup olmadığını bulan bir program yazınız.
    Mükemmel sayı: Bir sayının kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayı mükemmeldir.
    ORNEK:
    INPUT     : 6
    OUTPUT : 1, 2, 3
                  1 + 2 + 3 = 6 = 6 (Mükemmel)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi gir: ");
        int girilensayi = scanner.nextInt();

        int bolenlertoplami = 0;
        System.out.print("Girdigin " + girilensayi + " sayisininbolenleri: ");
        for (int i = 1; i < girilensayi; i++) {
            if (girilensayi % i == 0) {
                System.out.print(i + ", ");
                bolenlertoplami += i;
            }
        }
        System.out.println();
        if (bolenlertoplami == girilensayi) {
            System.out.println("Girdigin sayi mukemmel!");
        } else {
            System.out.println("Girdigin sayi cacik cikti :)");
        }
    }
}