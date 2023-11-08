package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task29 {
    // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
    // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
    // ornek : Haluk  output: HaLuK

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string ifade giriniz: ");
        String str = scanner.nextLine();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) {
                str2 += Character.toUpperCase(c);
            } else {
                str2 += Character.toLowerCase(c);
            }
        }

        System.out.println(str2);
    }
}