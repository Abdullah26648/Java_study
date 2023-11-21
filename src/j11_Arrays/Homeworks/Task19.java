package j11_Arrays.Homeworks;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int maxLength = Math.max(arr1.length, arr2.length);
        int[][] result = new int[maxLength][];

        for (int i = 0; i < maxLength; i++) {
            int[] innerArr1 = (i < arr1.length) ? arr1[i] : new int[0];
            int[] innerArr2 = (i < arr2.length) ? arr2[i] : new int[0];

            int maxInnerLength = Math.max(innerArr1.length, innerArr2.length);
            result[i] = new int[maxInnerLength];

            for (int j = 0; j < maxInnerLength; j++) {
                int value1 = (j < innerArr1.length) ? innerArr1[j] : 0;
                int value2 = (j < innerArr2.length) ? innerArr2[j] : 0;

                result[i][j] = value1 + value2;
            }
        }
        System.out.println(Arrays.deepToString(result));
    }

}