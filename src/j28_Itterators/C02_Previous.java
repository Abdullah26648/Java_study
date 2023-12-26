package j28_Itterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>(Arrays.asList("Trilece", "KazanDibi", "HavucDilimi", "CennetCamuru", "Kunefix", "Ball-Gaymah", "Trilece"));
        System.out.println("First version of l1 " + l1);

        System.out.println("   ***   task01   ***   ");

        // Task01-> l1 elemanlarını  sondan başa dogru print eden code create ediniz.
        ListIterator<String> it1 = l1.listIterator();
        while (it1.hasNext()) {
            it1.next();
        }
        while (it1.hasPrevious()) {
            System.out.print(it1.previous() + " ");
        }

        System.out.println("   ***   task02   ***   ");

        // Task02-> l1son elemanını :-) ile update edip print eden code create ediniz.
        ListIterator<String> it2 = l1.listIterator();

        if (it2.hasNext()) {
            while (it2.hasNext()) {
                it2.next();
            }
            it2.previous();
            it2.set(it2.next() + " :-)");
            System.out.println("Updated l1 after Task02: " + l1);
        }
    }
}
