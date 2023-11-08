package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen doğum günüzü giriniz: ");
        String dogumgun = scanner.next();
        System.out.println(dogumgun);



    }
}
