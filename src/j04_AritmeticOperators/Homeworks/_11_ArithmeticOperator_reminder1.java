package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("Boulumden kalani ogrenmek istediginiz 2 tam sayiyi giriniz");
        System.out.print("Ilk sayiyi girin : ");
        int num1 = dp.nextInt();
        System.out.print("Ikinci sayiyi girin : ");
        int num2 = dp.nextInt();
        int sonuc = num1 % num2;

        //Kodu aşağıya yazınız.
        System.out.println("Girilen 2 tam sayinin boulumden kalani sonucu : " + sonuc);



    }
}
