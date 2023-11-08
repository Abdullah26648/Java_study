package j08_Loops;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // Ayni zamanda Task26 fakat while ile.
        // Task -> verilen bir tam sayının rakamları toplamını print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rakamlarını toplamak istediğiniz bir sayı giriniz: ");
        long sayi = scanner.nextLong(); // long aldim cunku sayi cok buyuk olabilir.
        long toplam = 0;

        while (sayi>0) {
            toplam += sayi%10;
            sayi = sayi/10;
        }
        System.out.println("Rakamların toplamı = " + toplam);
    }
}
