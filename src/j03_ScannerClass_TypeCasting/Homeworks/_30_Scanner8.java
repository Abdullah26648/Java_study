package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kg cinsinden bir ağırlık yazınız: ");
        byte kg = scanner.nextByte();
        System.out.println(kg);




    }
}
