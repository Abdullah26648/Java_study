package j28_Itterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task02 {
    public static void main(String[] args) {
        /*  task->
        Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
        elementleri silip print eden code create ediniz
        (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
        */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14,25,36,47,58,69,12,45,78));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            if (currentNumber <= 20 || currentNumber >= 40) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
