package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner dp = new Scanner(System.in);
        System.out.println("Carpmak istediginiz 4 tam sayiyi giriniz");
        System.out.print("Ilk sayiyi girin : ");
        int num1 = dp.nextInt();
        System.out.print("Ikinci sayiyi girin : ");
        int num2 = dp.nextInt();
        System.out.print("Ucuncu sayiyi girin : ");
        int num3 = dp.nextInt();
        System.out.print("Dorduncu sayiyi girin : ");
        int num4 = dp.nextInt();
        int sonuc = num1 * num2 * num3 * num4;
        //Kodu aşağıya yazınız.
        System.out.println("Girilen 4 tam sayinin birbirine çarpma sonucu : " + sonuc);




    }
}
