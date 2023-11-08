package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /* Verilen iki tane int (num1, num2) ile ilgili,
        Eger num1  num2 ya  eşitse console'da true yazsın.
        Değilse false
        Kodu aşağıya yazınız. */

        Scanner dp = new Scanner(System.in);

        System.out.print("1. sayiyi girin: ");
        int num1 = dp.nextInt();
        System.out.print("2. sayiyi girin: ");
        int num2 = dp.nextInt();
        System.out.println("Girilen sayilar aynimi ?: " + (num1 == num2));
    }
}
