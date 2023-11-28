package j12_ArrayList.Homeworks;


import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {
    static Integer[] array = new Integer[]{1,2,2,3,1,4,2,5,6,8,7,5,9,1};
    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        System.out.println(Arrays.toString(array));
        deleteDuplicates(array);
    }

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
}