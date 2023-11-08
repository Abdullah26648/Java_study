package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80
        Scanner scanner = new Scanner(System.in);
        System.out.print("Carpin tablosunu ogrenmek istediginiz tam sayiyi giriniz: ");
        int sayi = scanner.nextInt();
        int sayac = 1;
        while (sayac <= 10) {
            System.out.print(sayi + "x" + sayac + "=" + (sayi * sayac)+",");
            sayac++;
        }
    }
}