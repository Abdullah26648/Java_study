package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {
    static Integer[] array = new Integer[]{1, 3, 5, 3, 5, 6, 1, 7};
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        System.out.println(Arrays.toString(array));
        deleteDuplicates(array);
    }//main sonu

    private static void deleteDuplicates(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : array) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        Integer[] noDuplicate = new Integer[list.size()];
        list.toArray(noDuplicate);
        System.out.println(Arrays.toString(noDuplicate));
    }
}//class sonu