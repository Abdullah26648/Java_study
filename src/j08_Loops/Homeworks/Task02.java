package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Biseyler yazasan: ");
        String ifade = scanner.next();
        String tersifade = "";
        for (int i = ifade.length()-1 ; i>=0; i--){
            tersifade += ifade.charAt(i);
        }
        if (tersifade.equals(ifade)){
            System.out.println("Yazdigin Polindrome");
        }
        else{
            System.out.println("Yazdigin Polindrome değil");
        }
    }
}