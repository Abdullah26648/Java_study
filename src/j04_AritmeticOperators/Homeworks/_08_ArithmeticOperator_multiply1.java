package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("Carpmak istediginiz 3 sayiyi giriniz");
        System.out.print("Ilk sayiyi girin : ");
        double num1 = dp.nextDouble();
        System.out.print("Ikinci sayiyi girin : ");
        double num2 = dp.nextDouble();
        System.out.print("Ucuncu sayiyi girin : ");
        double num3 = dp.nextDouble();
        double sonuc = num1 * num2 * num3;

        //Kodu aşağıya yazınız.
        System.out.println("Girilen 3 tam sayinin birbirine çarpma sonucu : " + sonuc);





    }
}
