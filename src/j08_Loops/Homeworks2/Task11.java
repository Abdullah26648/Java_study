package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sen 0 girene kadar toplicaz basla !!!");
        int toplam = 0 ;
        while (true) {
            System.out.print("Gonder gelsin: ");
            int sayi = scanner.nextInt();
            if (sayi==0) {
                break;
            }
            toplam += sayi;
        }
        System.out.print("Girdigin sayilarin toplami: " + toplam);
    }
}