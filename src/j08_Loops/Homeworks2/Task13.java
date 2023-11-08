package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programımız x karakteri girilene kadar JavaTar, x karakteri girildiğinde JavaCAN yazacak.");
        String input;

        do {
            System.out.print("Gir bakalım karakterini: ");
            input = scanner.nextLine();
            if (!"x".equals(input)) { // Girilen karakter x degilse JavaTar
                System.out.println("JavaTar");
            }
        } while (!"x".equals(input)); // x girilene kadar don dur :)

        if ("x".equals(input)) { // Girilen karakter x ise JavaCAN
            System.out.println("JavaCAN");
        }
    }
}