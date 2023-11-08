package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

        /* Oluşturulan double'lar hakkında (num1, num2)
        birbirine eşit olup olmadıklarını doğrulayın.
        Eğer eşitlerse konsolda true yazacaktır.
        Kodu aşağıya yazınız. */

        Scanner dp = new Scanner(System.in);

        System.out.print("1. sayiyi girin: ");
        double num1 = dp.nextDouble();
        System.out.print("2. sayiyi girin: ");
        double num2 = dp.nextDouble();

        System.out.println("Girilen sayilar esit mi ?: "+ (num1 == num2));
    }
}
