package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ifade giriniz: ");
        String ifade = scanner.nextLine();

        System.out.print("Aranan harfi giriniz: ");
        char hedefHarf = scanner.next().charAt(0);

        int harfSayisi = 0;

        for (int i = 0; i < ifade.length(); i++) {
            char karakter = ifade.charAt(i);
            if (karakter == hedefHarf) {
                harfSayisi++;
            }
        }
        System.out.println(hedefHarf + " sayısı: " + harfSayisi);
    }
}