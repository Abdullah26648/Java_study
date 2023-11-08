package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        //  TASK : Kullanıcıdan alacağınız, 3 kelimelik  ismi Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 kelimelik  isim giriniz: ");
        String adSoyad = scanner.nextLine();
        String[] ad = adSoyad.split(" ");
        if (ad.length == 3) {
            String ilkad = ad[0];
            String ikinciad = ad[1];
            String soyad = ad[2];
            char ilkBas = ilkad.toUpperCase().charAt(0);
            char ikinciBas = ikinciad.toUpperCase().charAt(0);
            char soyadBas = soyad.toUpperCase().charAt(0);
            System.out.println("Isiminizin kisaltmasi: " + ilkBas + "." + ikinciBas + "." + soyadBas);
        } else {
            System.out.println("Lütfen 3 kelimelik bir isim girin!!!");
        }
    }
}