package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        int harfSayisi = 0;
        int rakamSayisi = 0;
        int ozelKarakterSayisi = 0;

        int index = 0;
        do {
            char karakter = metin.charAt(index);
            if (Character.isLetter(karakter)) { // Harf ise harfsayisina +1
                harfSayisi++;
            } else if (Character.isDigit(karakter)) { // Rakam ise rakamSayisi +1
                rakamSayisi++;
            } else {
                ozelKarakterSayisi++; // Ikiside degilse ozelKarakterSayisi +1
            }
            index++; // Sayac
        } while (index < metin.length());

        System.out.println("Harf Sayısı: " + harfSayisi);
        System.out.println("Rakam Sayısı: " + rakamSayisi);
        System.out.println("Özel Karakter Sayısı: " + ozelKarakterSayisi);
    }
}