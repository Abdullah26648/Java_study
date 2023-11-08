package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */

        Scanner dp = new Scanner(System.in);
        System.out.println("Toplamak istediginiz 2 tam sayi giriniz");
        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        System.out.println("Girilen 2 tam sayinin toplami : " + (num1 + num2));


    }
}
