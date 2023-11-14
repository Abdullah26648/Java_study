package j11_Arrays.Homeworks;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
        Integer[] array = new Integer[]{25,30,30,35,100};
        Integer total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println(total);
    }
}