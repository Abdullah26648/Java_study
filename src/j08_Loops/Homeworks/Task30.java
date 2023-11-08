package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk tamsayiyi giriniz: ");
        int int1 = scanner.nextInt();
        System.out.println("ikinci tamsayiyi giriniz: ");
        int int2 = scanner.nextInt();
        int toplam = 0;
        for (int i=(int1<int2?int1:int2);i<=(int1>int2?int1:int2);i++){
            toplam+=i;
        }
        System.out.println(toplam);
    }
}