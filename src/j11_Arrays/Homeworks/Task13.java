package j11_Arrays.Homeworks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */

        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Please enter 8 integer values:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (arr[i] % 3 == 0) {
                counter++;
            }
        }
        System.out.println("Number of elements divisible by 3: " + counter);
    }
}