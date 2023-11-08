package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in); //gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
        System.out.println("Please enter two numbers");
        System.out.print("Firs number: ");
        double num1 = input.nextDouble();
        System.out.print("Second number: ");
        double num2 = input.nextDouble();

        System.out.println("Select the operation you want to perform");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.print("Enter here: ");

        int operation = input.nextInt();

        switch (operation) {
            case 1:
                double result = addition(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtraction(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiplication(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = division(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation selection.");
        }
    }//main sonu
    private static double addition(double a, double b) {
        return a + b;
    }
    private static double subtraction(double a, double b) {
        return a - b;
    }
    private static double multiplication(double a, double b) {
        return a * b;
    }
    private static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero error!");
            return 0.0; // Returning 0 in case of a division by zero error.
        }
        return a / b;
    }
}//Class sonu