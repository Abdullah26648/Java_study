package j11_Arrays.Homeworks;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String[] array = new String[] {"Apple", "Orange" , "Banana", "Kiwi"};
        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
