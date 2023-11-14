package j11_Arrays.Homeworks;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String[][] array = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++) {
                if (array[i][j].equals("ohio")){
                    array[i][j] = "Florida";
                }
            }
        }
        for (int i = 0; i < array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}