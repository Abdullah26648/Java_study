package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("Boulumden kalani ogrenmek istediginiz 2 tam sayiyi giriniz");
        System.out.print("Ilk sayiyi girin : ");
        int num1 = dp.nextInt();
        System.out.print("Ikinci sayiyi girin : ");
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        System.out.println("Girilen 2 tam sayinin boulumden kalani sonucu : " + (num1 % num2));



    }
}
