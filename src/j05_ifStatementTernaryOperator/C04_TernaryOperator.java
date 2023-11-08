package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        System.out.print((sayi < 10 && sayi>-10) ? "Girilen sayı tek basamaklıdır." : "Girilen sayi 2 basamakli yada daha fazladir");
    }
}
