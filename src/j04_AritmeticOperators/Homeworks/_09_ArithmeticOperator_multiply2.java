package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner dp = new Scanner(System.in);
        System.out.println("Carpmak istediginiz 4 sayiyi giriniz");
        System.out.print("Ilk sayiyi girin : ");
        double num1 = dp.nextDouble();
        System.out.print("Ikinci sayiyi girin : ");
        double num2 = dp.nextDouble();
        System.out.print("Ucuncu sayiyi girin : ");
        double num3 = dp.nextDouble();
        System.out.print("Dorduncu sayiyi girin : ");
        double num4 = dp.nextDouble();
        double sonuc = num1 * num2 * num3 * num4;

        //Kodu aşağıya yazınız.
        System.out.println("Girilen 4 tam sayinin birbirine çarpma sonucu : " + sonuc);



    }
}
