package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {

        /* TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
             Output:[Ali, Ayse, Can, Hasan, Suzan, Veli] */
        String[][] array = new String[][]{{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j =0; j < array[i].length; j++){
                arrayList.add(array[i][j]);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}