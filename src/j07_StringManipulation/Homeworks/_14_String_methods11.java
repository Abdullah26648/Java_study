package j07_StringManipulation.Homeworks;

import java.util.Scanner;

public class _14_String_methods11 {
    public static void main(String[] args) {
        //  apple  olan  bir String oluşturun. String'in apple'a eşit olup olmadığını doğrulayın. Büyük harf veya küçük harf önemli değildir.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str2 = scanner.nextLine();
        String str1 ="apple";
        System.out.println("Girilen string apple a esit mi?: "+str1.equalsIgnoreCase(str2));
    }
}