package j11_Arrays.Homeworks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int total = 0;

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            total += array[i];
        }

        int average = total/size;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>average){
                counter++;
            }
        }
        System.out.println("This many number bigger than the average: "+counter);
    }
}