package j11_Arrays.Homeworks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.
        Integer[] array = new Integer[]{5,6,8,12,14,19};
        Integer total = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1){
                total -= array[i];
            } else {
                total += array[i];
            }
        }
        System.out.println(total);
    }
}