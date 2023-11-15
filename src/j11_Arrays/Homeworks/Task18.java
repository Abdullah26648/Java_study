package j11_Arrays.Homeworks;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int arr[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        int newArray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            newArray[i] = sum;
        }
        System.out.println(Arrays.toString(newArray));
    }
}