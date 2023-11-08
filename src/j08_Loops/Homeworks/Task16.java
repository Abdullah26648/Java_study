package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Asal olma durumunu kontrol etmek istediginiz pozitif bir tam sayi giriniz: ");
        Integer sayi = scanner.nextInt();
        boolean asalmi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                    asalmi = false;
                    break; // Eger false cikarsa loop devam etmesin diye.
            }
        }
        if (asalmi) {
            System.out.println("Girilen sayi asal");
        } else {
            System.out.println("Girilen sayi asal degil");
        }
    }
}