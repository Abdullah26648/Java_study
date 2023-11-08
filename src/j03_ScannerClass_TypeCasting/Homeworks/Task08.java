package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize1 vize2 ve final notlarini (sirasiyla) giriniz : ");
        int vize1 = scanner.nextInt();
        int vize2 = scanner.nextInt();
        int final0 = scanner.nextInt();
        int vizeNot = (vize1 + vize2) / 2;
        double gecmeNot = (vizeNot * 0.3) + (final0 * 0.7);
        System.out.println("Gecme  Notunuz : "+gecmeNot);
    }
}
