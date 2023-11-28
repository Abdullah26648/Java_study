package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        fibonacci(list);
        System.out.println(list);
    }
    private static void fibonacci(ArrayList<Integer> list){
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int a = 1, b = 1, c = 0;

        while (c <= number) {
            list.add(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}