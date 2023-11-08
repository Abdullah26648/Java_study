package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ilk tamsayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Ikinci tamsayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        int buyuk;
        int kucuk;
        if (sayi1>sayi2) {
            buyuk = sayi1;
            kucuk = sayi2;
        } else {
            buyuk = sayi2;
            kucuk = sayi1;
        }
        while (kucuk <= buyuk) {
            System.out.print(kucuk == buyuk ? kucuk:kucuk + "-");
            kucuk++;
        }
    }
}