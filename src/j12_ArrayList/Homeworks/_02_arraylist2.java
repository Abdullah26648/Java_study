package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int result = getsum(myList);
        System.out.println("Total is: "+result);

    }

    private static int getsum(ArrayList<Integer> myList) {
        int total = 0;
        for (int i : myList) {
            total += i;
        };
        return total;
    }
}