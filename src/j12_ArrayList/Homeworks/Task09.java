package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter a non-integer to finish):");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int sumOfSquares = calculateSumOfSquares(numbers);

        System.out.println("Sum of the squares: " + sumOfSquares);
    }

    private static int calculateSumOfSquares(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number * number;
        }

        return sum;
    }
}