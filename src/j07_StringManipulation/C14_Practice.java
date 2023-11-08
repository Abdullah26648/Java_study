package j07_StringManipulation;

import java.util.Scanner;

public class C14_Practice {
    public static void main(String[] args) {
        /*Task-> Girilen bir String'deki bir karakterin tekrarlı veya tekrarsız
        olmasını kontrol eden code create ediniz
        Ör: Helloooo==> H-> Tekrarsız     e-->Tekrarsız   l--> Tekrarlı   o-->Tekrarlı
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str1 = scanner.next();
        System.out.println("Aramak istediginiz karakteri giriniz");
        Character c = scanner.next().charAt(0);
        if (str1.indexOf(c) == str1.lastIndexOf(c)) {
            System.out.println("Tekrarli");
        } else {
            System.out.println("Tekrarsiz");
        }
    }
}