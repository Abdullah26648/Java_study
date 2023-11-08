package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk tamsayıyı giriniz: ");
        int baslangic = scanner.nextInt();
        System.out.print("Son tamsayıyı giriniz: ");
        int bitis = scanner.nextInt();
        System.out.println("Çift sayılar:");
        for (int i = (baslangic<bitis?baslangic:bitis); i < (baslangic>bitis?baslangic:bitis); i++) {
            System.out.print(i % 2 == 0 ? i+" ":" ");
        }
    }
}