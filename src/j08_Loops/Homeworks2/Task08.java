package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.println("Şifreniz şu kurallara uymalıdır:\n" +
                "1. İlk harf küçük harf olmalı\n" +
                "2. Son karakter rakam olmalı\n" +
                "3. Şifre boşluk içermemeli\n" +
                "4. Uzunluğu en az 10 karakter olmalı");

        while (true) {
            System.out.print("Şifrenizi oluşturunuz: ");
            password = scanner.nextLine();
            boolean gecerlimi = true; // Kodun surekli calisabilmesi icin "break" e kadar acik kapi.
            if (password.length() < 10) {
                gecerlimi = false;
                System.out.println("Şifreniz en az 10 karakter olmalı.");
            } else if (!Character.isLowerCase(password.charAt(0))) {
                gecerlimi = false;
                System.out.println("Şifrenizin ilk harfi küçük harf olmalı.");
            } else if (!Character.isDigit(password.charAt(password.length() - 1))) {
                gecerlimi = false;
                System.out.println("Şifrenizin son karakteri bir rakam olmalı.");
            } else if (password.contains(" ")) {
                gecerlimi = false;
                System.out.println("Şifre boşluk içeremez.");
            } else if (gecerlimi) {
                System.out.println("Şifre başarıyla kaydedildi.");
                break;
            }
        }
    }
}