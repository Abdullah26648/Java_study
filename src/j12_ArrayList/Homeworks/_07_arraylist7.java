package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7 {
    /*
    common_values() isminde bir method oluşturun.
    Parametre olarak 2 tane Integer ArrayList
    Return tipi integer ArrayList olmalı
    İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
    Örneğin;
    ArrayList 1:    3 , 2 , 5 , 6
    ArrayList 2:     5 , 8 , 9
    return  5 olmalı

    Örneğin;
    ArrayList 1: 8,7,9,6,7
    ArrayList 2: 6,7,12,3,1
    return 6 ve 7 olmalı
    */
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>(Arrays.asList(8,7,9,6,7));
        ArrayList<Integer> arraylist2 = new ArrayList<>(Arrays.asList(6,7,12,3,1));
        System.out.println(common_values(arraylist1, arraylist2));

    }
    private static ArrayList<Integer> common_values(ArrayList<Integer> arraylist1,ArrayList<Integer> arraylist2){
        ArrayList<Integer> commons = new ArrayList<>();
        for (int i : arraylist1) {
            if (arraylist2.contains(i) && !commons.contains(i)) {
                commons.add(i);
            }
        }
        return commons;
    }
}