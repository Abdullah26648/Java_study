package j11_Arrays.Homeworks;

public class _02_Create_array2 {

    public static void main(String[] args) {

    /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
        // Kodu aşağıya yazınız..
        Integer[] array = new Integer[]{13,15,14,16,16};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}