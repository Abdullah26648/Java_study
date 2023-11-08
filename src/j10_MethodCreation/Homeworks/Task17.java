package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task17 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541
         */
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String str = String.valueOf(num);
        System.out.println(reverse(str));
    }
    private static String reverse(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}