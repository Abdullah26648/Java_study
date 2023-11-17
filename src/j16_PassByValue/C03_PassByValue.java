package j16_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-> referans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
        */
        // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update edip print eden METHOD create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        List<Integer> sayilist = new ArrayList<Integer>(List.of(24,20,87));
        System.out.println("Update oncesi sayiList : "+sayilist);
        Listupdate1(sayilist);
        Listupdate2(sayilist);
        System.out.println("Update sonrasi meth sonrasi : "+sayilist);
    }

    private static void Listupdate2(List<Integer> sayilist) {
        for (Integer avuc : sayilist) {
            avuc += 33;
        }
        System.out.println("Listupdate2 meth sonrasi : "+sayilist);
    }

    private static void Listupdate1(List<Integer> sayilist) {
        for (int i = 0; i < sayilist.size(); i++){
            sayilist.set(i,sayilist.get(i)+21);
        }
        System.out.println("Listupdate1 meth sonrasi : "+sayilist);
    }
}