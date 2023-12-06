package j25_Exceptions;

import java.util.Date;

public class C11_CheckMemory {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("TotalMemory() = " + rt.totalMemory());
        System.out.println("Before loop freeMemory = " + rt.freeMemory());

        Date d = null;
        for (int i = 0; i < 10000; i++) {
            d = new Date(i);
            d = null;
        }
        System.out.println("After loop freeMemory = " + rt.freeMemory());

        rt.gc();

        System.out.println("After gc loop freeMemory = " + rt.freeMemory());
        // GC tum olusturalan objeleri silmeyi garanti etmedigi icin After GC Free Memory farkliliklar gosterebilir.
    }
}
