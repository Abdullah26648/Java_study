package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
        */
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        for (int i=1;i<=5;i++) {
            System.out.print("Bir sayi giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi <= 10 || sayi >= 20){
                toplam += sayi;
            }
        }
        System.out.println("10 ile 20 arasında olmayan sayıların toplamı: " + toplam);
    }
}