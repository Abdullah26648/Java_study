package j08_Loops.Homeworks3;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        //task-> bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ondalık sayı giriniz: ");
        double sayi = scanner.nextDouble();
        String str = Double.toString(sayi);
        int ondalikIndex = str.indexOf('.');
        if (ondalikIndex != -1) {
            String ondalikKisim = str.substring(ondalikIndex+ 1);
            int toplam = 0;
            int i = 0;
            do {
                int rakam = Character.getNumericValue(ondalikKisim.charAt(i));
                toplam += rakam;
                i++;
            } while (i < ondalikKisim.length());
            System.out.println("Ondalık kısmındaki rakamların toplamı: " + toplam);
        } else {
            System.out.println("Girdiğiniz sayı ondalık bir sayı değil.");
        }
    }
}