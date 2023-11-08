package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir isim giriniz: ");
        String isim = scanner.nextLine();
        System.out.print(isim);



    }
}
