package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        Scanner scanner = new Scanner(System.in);
        System.out.println("1'den 12'ye kadar bir sayi giriniz: ");
        int ay = scanner.nextInt();
        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiginiz ay 31 gundur.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gundur.");
                break;
            case 2:
                System.out.println("Yili giriniz: ");
                int yil = scanner.nextInt();
                System.out.println("Girdiginiz ay "+(yil%4==0 ? "29":"28")+" gundur.");
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz.");
        }
    }
}
