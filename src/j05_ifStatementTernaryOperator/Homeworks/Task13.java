package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
        TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz
        */
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int sayi2 = input.nextInt();
        System.out.print("Hangi islemi yapacaksiniz (+,-,*,/): ");
        char islem = input.next().charAt(0);

        if (islem == '+'){
            System.out.println(sayi1 + sayi2);
        } else if (islem == '-'){
            System.out.println(sayi1 - sayi2);
        } else if (islem == '*'){
            System.out.println(sayi1 * sayi2);
        } else if (islem == '/'){
            System.out.println(sayi1 / sayi2);
        }
    }
}
