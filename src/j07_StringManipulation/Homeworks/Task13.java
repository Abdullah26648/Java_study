package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aralarda boşluk kullanarak bir cümle yazınız: ");
        String str = scanner.nextLine();
        System.out.println("Bosluksuz karakter sayisi: "+str.replace(" ", "").length());
    }
}