package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kac adedini yazdiralim: ");
        int count = scanner.nextInt();
        printFibonacciSeries(count);
    }
    public static void printFibonacciSeries(int count) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Serisi: ");

        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}