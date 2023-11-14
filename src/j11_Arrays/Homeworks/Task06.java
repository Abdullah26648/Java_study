package j11_Arrays.Homeworks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        Integer[] array ={21, 52, 14, 63, 49, 31, 35, 53, 26};
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}