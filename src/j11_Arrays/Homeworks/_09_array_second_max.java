package j11_Arrays.Homeworks;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        Integer[] array = new Integer[]{15,25,22,18,30};
        Integer max = Integer.MIN_VALUE;
        Integer secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                secondmax = max;
                max = array[i];
            }
        }
        System.out.println(secondmax);
    }
}