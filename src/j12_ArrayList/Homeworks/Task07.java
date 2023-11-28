package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07 {
    static String[] names = {"Haluk", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};

    public static void main(String[] args) {

        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        swapping(names);

        System.out.println(Arrays.toString(names));
    }

    private static void swapping(String[] array) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        int index1 = 2;
        int index2 = 7;
        String temp = list.get(index1);

        list.set(index1, list.get(index2));
        list.set(index2, temp);

        list.toArray(array);
    }
}