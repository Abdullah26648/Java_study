package j11_Arrays.Homeworks;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        // Kodu aşağıya yazınız..

        String[] array = new String[] {"new jersey","new york","boston","California"};
        Integer counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        System.out.println(counter);
    }
}