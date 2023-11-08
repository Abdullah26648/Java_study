package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*    Verilen 2 tane int (num1, num2),
        Int'lerin farkını yazdırın. */

        Scanner dp = new Scanner(System.in);
        System.out.println("Farkini bulmak istediginiz 2 tam sayiyi giriniz");

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        if (num1>num2) {
            System.out.println("Girilen 2 tam sayinin farki : " + (num1 - num2));
        }
        else {
            System.out.println("Girilen 2 tam sayinin farki : " + (num2 - num1));
        }
    }
}
