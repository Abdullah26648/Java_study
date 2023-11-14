package j11_Arrays.Homeworks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        Integer[] array = {1,2,-3,4,-5,-6};
        for (int i = 0; i < array.length; i++) {
            array[i] = array [i]* -1;
        }
        System.out.println(Arrays.toString(array));
    }
}