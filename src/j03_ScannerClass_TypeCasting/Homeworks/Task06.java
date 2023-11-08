package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task06 {

    public static void main() {
        main(null);
    }

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        hipotenus=birinciKenar*ikinciKenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci kenar: ");
        int a = scanner.nextInt();
        System.out.println("ikinci kenar: ");
        int b = scanner.nextInt();
        System.out.println("Hipotenus: " + Math.sqrt((a*a) + (b*b)));
    }
}
