package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz.. */
        Scanner input = new Scanner(System.in);
        System.out.print("Ad giriniz: ");
        String ad = input.nextLine();
        System.out.print("Soyad giriniz: ");
        String soyad = input.nextLine();
        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1));
        System.out.println(soyad.substring(0, 1).toUpperCase() + soyad.substring(1));
    }
}