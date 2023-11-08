package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir tam sayi giriniz: ");
        int sayi = input.nextInt();
        if (sayi >= 100 && sayi <= 999) {
            int[] basamak = new int[3];
            basamak[0] = sayi % 10;
            basamak[1] = (sayi / 10) % 10;
            basamak[2] = (sayi / 100) % 10;
            int birler = basamak[0];
            int onlar = basamak[1];
            int yuzler = basamak[2];
            System.out.println("Girdiginiz tam sayinin birler basamagi: "+birler);
            System.out.println("Girdiginiz tam sayinin onlar basamagi: "+onlar);
            System.out.println("Girdiginiz tam sayinin yuzler basamagi: "+yuzler);
        } else {
            System.out.println("Lutfen 3 basamakli bir sayi giriniz !!!");
        }
    }
}