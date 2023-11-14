package j11_Arrays.Homeworks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        Integer[] array = new Integer[]{12,14,21,23,10,4};
        Integer total =  0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            average = total / array.length;
        }
        System.out.println(average);
    }
}