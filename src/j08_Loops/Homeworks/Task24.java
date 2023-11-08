package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String string = scanner.nextLine();
        String ters = "";
        for (int i = string.length()-1; i>=0; i--) {
            ters += string.charAt(i);
        }
        System.out.print("Girilen stringin tersi: "+ters);
    }
}