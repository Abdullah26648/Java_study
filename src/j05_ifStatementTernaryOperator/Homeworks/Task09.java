package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();
        if (sayi < 0) {
            System.out.println("negatif");
        } else if (sayi > 0) {
            System.out.println("pozitif");
        }else{
            System.out.println("sayiniz 0");
        }
    }
}
