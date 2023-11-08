package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.contains(" "));
    }
}