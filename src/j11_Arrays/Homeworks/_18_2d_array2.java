package j11_Arrays.Homeworks;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.

        Integer[][] array = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        Integer total = 0;
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                total += array[i][j];
            }
        }
        System.out.println(total);
    }
}