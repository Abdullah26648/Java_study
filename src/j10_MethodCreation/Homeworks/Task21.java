package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task21 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();
        printNumberOfDigits(number);
    }
    public static void printNumberOfDigits(int number) {
        String numberStr = String.valueOf(number);
        int numberOfDigits = numberStr.length();

        System.out.println("Your number is "+numberOfDigits+" figure");
    }
}