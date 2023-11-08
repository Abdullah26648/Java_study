package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        // Task -> girilen bir char karakterden sonra gelen 10 karakteri print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str0 = scanner.nextLine();
        System.out.print("Hangi karakterden sonraki 10 karakter yazılsın: ");
        char char0 = scanner.next().charAt(0);
        String str1 = "";
        // !!! Kod cok uzamansin diye ignorecase eklemedim istege bagli eklenebilir. !!!
        if (str0.indexOf(char0) != -1 && str0.indexOf(char0) < str0.length() - 10) { // Girilen karakter ve sonrasinda 10 karakter varmi?.
            str1 = str0.substring(str0.indexOf(char0) + 1, str0.indexOf(char0) + 11); // Sartlar saglaniyorsa stringimizi olsturuyoruz.
        } else {
            System.out.println("Girilen karakterden sonra 10 karakter bulunamadı.");
        }
        System.out.println("Girilen karakterden sonraki 10 karakter: " + str1);
    }
}