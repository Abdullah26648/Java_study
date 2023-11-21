package j11_Arrays.Homeworks;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("agam bir metin gir : ");//hayat java ile cok kolay

        String inputString = scan.nextLine().toLowerCase();
        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int currentCount = 0;

            for (int j = 0; j < inputString.length(); j++) {
                if (inputString.charAt(j) == currentChar) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
            }
        }

        System.out.println("Maximum occurring character is: " + maxChar + " and it occuras "+ maxCount +" times.");
    }
}