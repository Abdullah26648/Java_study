package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
		/*  TASK :
		StringMethods:
		girilen  bir strngin ilk yarisini print eden code create ediniz
	    ORNEK:
		INPUT :istanbul
	    OUTPUT :ista */
        Scanner input = new Scanner(System.in);
        System.out.print("String giriniz: ");
        String string = input.nextLine();
        System.out.println(string.toLowerCase().substring(0, string.length()/2));
    }
}
