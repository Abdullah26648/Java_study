package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        // Task-> girilen bir tamsayının ciftse yarısını  değilse "agıdeşşş tek'in yarısı tam olmazzz" print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        System.out.print(sayi % 2 == 0? sayi/2 : "agıdeşşş tek'in yarısı tam olmazzz");
    }
}