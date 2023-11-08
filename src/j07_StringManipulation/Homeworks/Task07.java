package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        /* Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz. */
        Scanner input = new Scanner(System.in);
        System.out.print("String giriniz: ");
        String string = input.nextLine();
        System.out.print("Index giriniz: ");
        int index = input.nextInt();
        System.out.println(string.charAt(index));
    }
}