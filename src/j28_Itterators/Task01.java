package j28_Itterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
            /*
            task -> Verilen bir integer listin tek  elemanrının karesini tersten iterator  print eden code create ediniz
            */
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14,25,36,47,58,69,12,45,78));

            ListIterator<Integer> iterator = list.listIterator(list.size());

            while (iterator.hasPrevious()) {
                int current = iterator.previous();

                if (current % 2 != 0) {
                    int square = current * current;
                    System.out.print(square+" ");
                }
            }
    }
}
