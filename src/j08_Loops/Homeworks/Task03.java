package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        // falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini almak istediginiz sayiyi giriniz: ");
        Integer sayi = scanner.nextInt();
        long faktoriyel = 1;
        for (int i = 1; i <= sayi; i++){
            faktoriyel *= i;
        }
        System.out.print("Girdiniz sayinin faktoriyeli: " + faktoriyel);
    }
}