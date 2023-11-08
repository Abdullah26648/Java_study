package j08_Loops.Loop01_For_Loop;

import java.util.Scanner;

public class C02_For_Loop {
    public static void main(String[] args) {
        // task -> girilen sayidan 100 e kadar olan 4 un kati tam sayilari yanyana print ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("100'den kucuk bir tam sayi giriniz: ");
        Integer sayi = scan.nextInt();
        for (int i = sayi ; i <=100; i++){
            if (i%4==0){
                System.out.print(i+" ");
            }
        }
    }
}