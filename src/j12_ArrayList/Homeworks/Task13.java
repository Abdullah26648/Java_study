package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        // 3, 5+1, 2+7+9, 2+3+5+7
        sequentialSUM(arr);
    } // main sonu
    private static void sequentialSUM(int[] arr){
        List<Integer> arrlist = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (i == 0 || i == 2 || i == 5 || i == 9) {
                arrlist.add(total);
                total = 0;
            }
        }
        System.out.println(arrlist);
    }
}