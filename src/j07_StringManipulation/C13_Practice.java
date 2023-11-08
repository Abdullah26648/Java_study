package j07_StringManipulation;

import java.util.Scanner;

public class C13_Practice {
    public static void main(String[] args) {
        /*
        Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
        sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
        1-en az 8 karakter uzunlugunda,
        2-ilk harf buyuk,
        3-son harf kucuk,
        4-boşluk içermemeli
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bi sifre giresen : ");
        String str1 = scanner.next();
        if (str1.length()>=8 && Character.isUpperCase(str1.charAt(0)) && !str1.contains(" ") && Character.isLowerCase(str1.charAt(str1.length() - 1))){
            System.out.println("gayet başarılı DEWAMKEEE :)");
        } else {
            System.out.println("Çok başarısız :( agam yeni paaword giresen");
        }

    }
}
