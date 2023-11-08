package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        int asciiDegeri = (int) karakter;

        System.out.println("Girilen karakterin ASCII değeri: " + asciiDegeri);

    }


}
