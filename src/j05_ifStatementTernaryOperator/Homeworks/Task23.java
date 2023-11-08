package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
        /*
            Bir sayinin mutlak degerini hesaplamak icin ternary operatoru kullanarak kod yaziniz.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        double sayi = scanner.nextDouble();

        // Ternary operatörünü kullanarak mutlak değeri hesapla
        double mutlakDeger = (sayi >= 0) ? sayi : -sayi;

        System.out.println("Mutlak değer: " + mutlakDeger);

    }

}
