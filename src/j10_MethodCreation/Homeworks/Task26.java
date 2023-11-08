package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task26 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou
        System.out.print("Please enter your expression: ");
        String expression = input.nextLine();
        String allunique = deleteduplication(expression);
        System.out.println("Your expression without duplication: "+allunique);
    }//main sonu
    private static String deleteduplication(String expression) {
        String result = "";
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }
}