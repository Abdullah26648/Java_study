package j11_Arrays.Homeworks;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
        Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
        input:  [1,2, 3]
        output [2, 3, 1]
        */

        Integer[] array = {1,2,3};
        Integer[] newArray = new Integer[3];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[0] = array[array.length - 1];
        System.out.println(Arrays.toString(newArray));
    }
}