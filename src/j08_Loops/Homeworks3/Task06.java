package j08_Loops.Homeworks3;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //task-> kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile bittiğini kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle giresen: ");
        String cumle = scanner.nextLine();
        if (cumle.length() > 0) {
            char ilkHarf = cumle.charAt(0);
            char sonChar = cumle.charAt(cumle.length() - 1);
            if (Character.isUpperCase(ilkHarf) && sonChar == '.' ) {
                System.out.println("Girilen isim büyük harfle başlıyor ve nokta ile bitiyor.");
            } else {
                System.out.println("Girilen ismin büyük harfle baslamiyor ve/veya nokta ile bitmiyor.");
            }
        } else {
            System.out.println("Geçerli bir isim girmelisiniz.");
        }
    }
}