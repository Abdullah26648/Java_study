package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */
        System.out.print("Enter a phrase: ");
        String inputText = input.nextLine();

        String hackerText = convertToHackerLanguage(inputText);
        System.out.println("In Hacker Language: " + hackerText);
    }//main sonu
    private static String convertToHackerLanguage(String text) {
        text = text.replaceAll("a", "7");
        text = text.replaceAll("v", "1");
        text = text.replaceAll("c", "-4");
        text = text.replaceAll("e", "2");

        return text;
    }
}//Class sonu
