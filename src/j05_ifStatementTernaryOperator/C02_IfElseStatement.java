package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {
        // task-> girilen sayının 18 den buyulugunu kontrol eden code create ediniz..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int x = scanner.nextInt();
        if (x >= 18) {
            System.out.println("18 yaşından büyük");
        } else {
            System.out.println("18 yaşından küçük");
        }
    }
}
