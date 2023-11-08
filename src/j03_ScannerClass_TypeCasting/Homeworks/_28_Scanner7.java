package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir Banka Hesabınız Var mı? ");
        boolean bankahesabi = scanner.nextBoolean();
        System.out.println(bankahesabi);


    }
}
