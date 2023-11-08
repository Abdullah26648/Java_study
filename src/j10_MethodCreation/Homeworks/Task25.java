package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        //task-> girilen sayını faktoriyelini print eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    private static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}