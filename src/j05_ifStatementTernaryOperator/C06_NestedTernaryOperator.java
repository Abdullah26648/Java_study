package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
        TASK :
        Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
        10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
        Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        System.out.print((sayi >= 0) ? ((sayi < 10) ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi");
    }
}