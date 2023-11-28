package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Program will store numbers until input 0 !!!");
        while (true) {
            System.out.print("Please enter the number: ");
            double score = scanner.nextDouble();
            if (score != 0) {
                list.add(score);
            } else {
                break;
            }
        }
        System.out.println("Average: " + calculateaverage(list));
        aboveaverage(list);
    }

    private static double calculateaverage(ArrayList<Double> list) {
        double total = 0;
        for (double i : list) {
            total += i;
        }
        return total / list.size();
    }

    private static void aboveaverage(ArrayList<Double> list) {
        ArrayList<Double> AboveAverage = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (calculateaverage(list) < list.get(i)) {
                AboveAverage.add(list.get(i));
            }
        }
        System.out.println("Above average numbers: " + AboveAverage);
    }
}