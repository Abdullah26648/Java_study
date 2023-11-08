package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /*  Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
        Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir
        Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur
        */
        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Tamsayı giriniz: ");
        int tamsayi = input.nextInt();
        System.out.println(tamsayi % 2 == 0 ? "Tamsayı çift" : "Tamsayı tek");
        /* ternary operator action sonucu true veya false a gore cerecegi output eger data type
        uygun bir variable a atanmassa CTE verir.
        Cozum olarak ternary ciktisi yada bir variable a atanmali yada sout gibi dogruda bir
        action'da kullanilmali.
         */

        // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
        System.out.print("Tamsayı giriniz: ");
        int tamsayi2 = input.nextInt();
        System.out.println(tamsayi2 > 0? "Tamsayı pozitif" : "Tamsayı negatif");

        // Task03-> girilen iki tamsayının   buyugunu create eden code create ediniz.
        System.out.print("Tamsayı giriniz: ");
        int tamsayi3 = input.nextInt();
        System.out.print("Tamsayi giriniz: ");
        int tamsayi4 = input.nextInt();
        System.out.println(tamsayi3 > tamsayi4 ? tamsayi3 : tamsayi4);

        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        System.out.println("   ***  task04   ***   ");
        System.out.print("Tamsayı giriniz: ");
        Integer tamsayi5 = input.nextInt();
        System.out.print("Tamsayi giriniz: ");
        Integer tamsayi6 = input.nextInt();
        System.out.println((tamsayi5*tamsayi6)<0 ? "agam DEWAMKEEE" : tamsayi6+tamsayi5);
    }
}