package j08_Loops.Homeworks3;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();
        int kareKok = (int) Math.sqrt(sayi);
        do {
            if (kareKok * kareKok == sayi) {
                System.out.println(sayi + " bir tam karedir ve karekökü " + kareKok + " dır.");
                break;
            } else {
                System.out.println(sayi + " bir tam kare değildir. Lütfen başka bir sayı giriniz: ");
                sayi = scanner.nextInt();
                kareKok = (int) Math.sqrt(sayi);
            }
        } while (true);
    }
}