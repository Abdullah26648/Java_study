package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
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
