package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gunde kac saat uyuyorsunuz : ");
        int saat = scanner.nextInt();

        int ayda = (saat*30)/24 ;
        int yilda = (saat*365)/24 ;
        int _40_yilda = (saat*14600)/24 ;


        System.out.println("Ayda " + ayda + ", yilda " + yilda + ", 40 yilda " + _40_yilda + " gununuz uykuda geciyor");
    }
}
