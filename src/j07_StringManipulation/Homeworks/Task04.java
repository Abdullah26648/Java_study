package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        /* Task->
        Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
        ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
        name1= Java
        name2= haluk
        Print ==> Jahalukva */
        Scanner input = new Scanner(System.in);
        System.out.print("kelime1'i giriniz: ");
        String name1 = input.nextLine();
        System.out.print("kelime2'yi giriniz: ");
        String name2 = input.nextLine();
        System.out.println((name1.length() % 2 == 0) ? (name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2)) : "kelime2 kelime1 eklenemez");
    }
}