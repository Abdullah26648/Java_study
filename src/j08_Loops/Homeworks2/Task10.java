package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi sayiya kadar olan tek sayilarin toplamini istiyorsunuz?: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        while (sayi>0) {
            if (sayi%2==1){
                toplam += sayi;
            }
            sayi--;
        }
        System.out.print("Tek sayilarin toplami: "+toplam);
    }
}