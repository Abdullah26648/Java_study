package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*   Verilen 4 tane int vardır.
        Int'lerin toplamlarını yazdırın  */
        Scanner dp = new Scanner(System.in);
        System.out.println("Toplamak istediginiz 4 tam sayiyi giriniz");
        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();
        int num4 = dp.nextInt();

        //Kodu aşağıya yazınız.
        System.out.println("Girilen 4 tam sayinin toplami : " + (num1 + num2 + num3 + num4));



    }
}
