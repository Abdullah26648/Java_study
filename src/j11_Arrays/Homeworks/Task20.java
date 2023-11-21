package j11_Arrays.Homeworks;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int unwantedElement = 7;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == unwantedElement) {
                count++;
            }
        }

        int newarr[] = new int[arr.length - count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != unwantedElement) {
                newarr[index++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(newarr));
    }
}