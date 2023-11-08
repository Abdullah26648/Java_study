package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac tamsayi toplayacaksiniz?: ");
        int sayac = scanner.nextInt();
        int toplam = 0;
        while (sayac >= 1) {
            System.out.print(sayac + ". tamsayiyi giriniz: ");
            int sayi = scanner.nextInt();
            toplam += sayi;
            sayac--;
        }
        System.out.print("Girdiginiz tam sayilarin toplami: "+toplam);
    }
}