package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task18 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*  Task->
        Verilen bir listede, istenen iki index'deki elementlerin yerini
        kalici olarak degistiren bir method create ediniz */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);
        System.out.print("Which index numbers do you want to swap?\nEnter first index: ");
        int a = scanner.nextInt();
        System.out.print("Enter second index: ");
        int b = scanner.nextInt();
        swapindex(sayilar, a, b);
    }

    private static void swapindex(List<Integer> sayilar, int a, int b) {
        if (a >= 0 && a < sayilar.size() && b >= 0 && b < sayilar.size()) {
            int temp = sayilar.get(a);
            sayilar.set(a, sayilar.get(b));
            sayilar.set(b, temp);

            System.out.println("List after swapping index of " + a + " and " + b + ": " + sayilar);
        } else {
            System.out.println("Invalid indices. Please enter valid indices.");
        }
    }
}