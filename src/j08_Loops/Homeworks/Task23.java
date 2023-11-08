package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam+=i*i;
        }
        System.out.println("toplam = " + toplam);
    }
}