package j08_Loops.Homeworks3;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String isim = scanner.nextLine();
        if (isim.length() > 0) {
            char ilkHarf = isim.charAt(0);
            if (Character.isUpperCase(ilkHarf)) {
                System.out.println("Girilen ismin ilk harfi büyük.");
            } else {
                System.out.println("Girilen ismin büyük harfle baslamiyor.");
            }
        } else {
            System.out.println("Geçerli bir isim girmelisiniz.");
        }
    }
}