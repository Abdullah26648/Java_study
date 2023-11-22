package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        String fruit = "Orange";
        int count = getCount(fruitList, fruit);
        System.out.println("Count of " + fruit + ": " + count);
    }

    private static int getCount(ArrayList<String> fruitList, String targetFruit) {
        int counter = 0;
        for (String fruit : fruitList) {
            if (fruit.equals(targetFruit)) {
                counter++;
            }
        }
        return counter;
    }
}