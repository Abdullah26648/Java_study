package j08_Loops.Homeworks3;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi=0;
        int sayac=0;
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;
        } while (sayi!=0);
        System.out.println(sayi!=0?"Girdiginiz sayinin toplami: 0":"Girdiginiz "+ sayac +" sayinin toplami: "+toplam);
    }
}