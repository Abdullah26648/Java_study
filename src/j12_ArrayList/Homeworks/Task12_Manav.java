package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1", "elma - urun kodu : 2", "muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5"));//urunlerin atanacagi bos list
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0, 7.5, 1.3, 8.7, 9.2));//urun fiyatlarinin atanacagi bos list
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         */
        welcome();
        do {
            selectProductAndCalculate();
        } while (wantsToBuyMore());

        cashier();
    }

    private static void welcome() {
        System.out.println("Welcome to the Java Grocery Store!");
        System.out.println("*******************************");
    }

    private static void selectProductAndCalculate() {
        System.out.println("Product List:");
        for (String product : urunListesi) {
            System.out.println(product);
        }

        System.out.print("Please enter the product code you want to buy: ");
        int productCode = scan.nextInt();

        System.out.print("Please enter the weight you want to buy (in kg): ");
        double weight = scan.nextDouble();

        double productPrice = urunFiyatlari.get(productCode - 1);
        double totalCost = weight * productPrice;

        System.out.println("Total Cost: $" + totalCost);
        toplamOdenecekTutar += totalCost;
    }

    private static boolean wantsToBuyMore() {
        System.out.print("Do you want to buy another product? (Type 'y' for Yes / 'n' for No): ");
        char response = scan.next().charAt(0);

        return response == 'y' || response == 'Y';
    }

    private static void cashier() {
        System.out.println("*******************************");
        System.out.println("Total Amount to Pay: $" + toplamOdenecekTutar);
        System.out.println("Thank you and have a great day!");
    }
}