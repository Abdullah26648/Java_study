package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
            /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
            */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String girdi = scanner.nextLine();
        String cikti = "";

        for (int i = 0; i < girdi.length(); i++) {
            char currentChar = girdi.charAt(i); // Her chari tutan bir ara deger olusturup (currentChar) karakteri sirayla yakaliyoruz.
            if (cikti.indexOf(currentChar) == -1) { // Karakter tekrarlanmiyorsa ekliyoruz.
                cikti += currentChar;
            }
        }
        System.out.println("Harf tekrarlarının çıkarılmış hali: " + cikti);
    }
}
