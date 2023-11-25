package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8 {
    /*
    secondMax()  isminde bir method oluşturun.
    Parametre olarak integer ArrayList.
    Return tipi int olmalı.
    ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
    ÖRN;
    ArrayList   --  5,3,4,6,7
    CEVAP : 6
    */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 4, 6, 7));
        System.out.println(secondMax(arrayList));
    }

    private static int secondMax(ArrayList<Integer> arrayList) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                secondMax = max;
                max = arrayList.get(i);
            } else if (arrayList.get(i) > secondMax && arrayList.get(i) < max) {
                secondMax = arrayList.get(i);
            }
        }
        return secondMax;
    }
}