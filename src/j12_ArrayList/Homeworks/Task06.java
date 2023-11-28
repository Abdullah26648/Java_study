package j12_ArrayList.Homeworks;

import java.util.ArrayList;

public class Task06 {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
        print eden code create ediniz.
        */
        Integer[] array = new Integer[]{1,2,3,4,5,6};
        System.out.println(seperator(array));
    }//main sonu
    private static ArrayList<Integer> seperator(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                list.add(array[i]);
            }
        }
        return list;
    }
}