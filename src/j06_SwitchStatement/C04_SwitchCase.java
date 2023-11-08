package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...
        Scanner scanner = new Scanner(System.in);
        System.out.println("1'den 12'ye kadar bir sayi giriniz: ");
        int ay = scanner.nextInt();
        switch (ay){
            case 12:
            case 1:
            case 2:
                System.out.println("Mevsim KIS");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mevsim ILKBAHAR");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mevsim YAZ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mevsim SONBAHAR");
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz.");
        }
    }
}