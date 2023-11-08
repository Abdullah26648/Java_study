package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan tek seferde alınan ad soyadı ifadeyi ad ve soyadı ayrı ayrı print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad ve Soyad: ");
        String adSoyad = scanner.nextLine();
        int bosluk = adSoyad.indexOf(" ");
        System.out.println("Adiniz: "+adSoyad.toUpperCase().substring(0,bosluk)+"\nSoyadiniz:"+adSoyad.toUpperCase().substring(bosluk));
    }
}