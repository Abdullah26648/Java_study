package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        /* TASK : Girilen  isim sadece 3 harfli olmalidir ternary
        kullanarak harflerin unique(farkli) olmasını control eden code create ediniz. */
        Scanner input = new Scanner(System.in);
        System.out.print("Isim giriniz: ");
        String name = input.nextLine();
        System.out.println(name.length() == 3 && name.charAt(0) != name.charAt(1) && name.charAt(0) != name.charAt(2) && name.charAt(1) != name.charAt(2) ? "Girilen isim 3 harfli ve harfleri farklı." : "3 harfli ve harfleri farklı bir isim girin !!!");
    }
}