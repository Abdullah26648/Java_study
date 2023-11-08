package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task24 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /* task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
                  Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34                                         */

        System.out.print("Please enter your number: ");
        int number = scanner.nextInt();
        printFibonacciSeries(number);
    }
    private static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci series up to " + n + ": ");

        while (a <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}