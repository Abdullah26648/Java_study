package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        /* Girilen String'in son karakterini silen code create ediniz... */
        Scanner input = new Scanner(System.in);
        System.out.print("String giriniz: ");
        String string = input.nextLine();
        System.out.println(string.substring(0, string.length() - 1));
    }
}