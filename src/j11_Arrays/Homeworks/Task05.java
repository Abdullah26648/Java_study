package j11_Arrays.Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String number = scanner.nextLine();

        String[] array = number.split("");
        String[] reversed = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}