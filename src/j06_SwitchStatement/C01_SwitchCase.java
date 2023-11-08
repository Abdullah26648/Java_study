package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*
        Switch-Case yapısı  if statement'e benzer action alır.
        Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez. Bir app actionda sabit bir degeri
        çoklu durum ile karsilastirmak için switch-case blok kullanılır. Switch-case blok'da  degiskene göre bir
        çok durumdan değişkene uyan durum gerçeklesir.
        if statement blok ile  switch-case blok birlikte tanımlanabiir.
        çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
        Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

        ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..
        Switch de sadece int, byte, short, char, String data type  kullanilabilir
        Eger 3 den fazla durum varsa switch() tercih edilir. */

        // Task-> verilen bir rakamın harf karakteri ile print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir rakam giriniz: ");
        String input = scanner.nextLine();
        switch (input) {
            case "0":
                System.out.println("Sifir");
                break;
            case "1":
                System.out.println("Bir");
                break;
            case "2":
                System.out.println("Iki");
                break;
            case "3":
                System.out.println("Uc");
                break;
            case "4":
                System.out.println("Dort");
                break;
            case "5":
                System.out.println("Bes");
                break;
            case "6":
                System.out.println("Alti");
                break;
            case "7":
                System.out.println("Yedi");
                break;
            case "8":
                System.out.println("Sekiz");
                break;
            case "9":
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Hata");
                break;
        }
    }
}