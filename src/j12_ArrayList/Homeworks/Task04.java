package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        ArrayList<String> resultList = new ArrayList<>();

        for (String name : list1) {
            if (!name.contains("a") && !name.contains("A")) {
                resultList.add(name);
            }
        }
        System.out.println(resultList);
    }
}