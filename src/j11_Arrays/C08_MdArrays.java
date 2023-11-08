package j11_Arrays;

public class C08_MdArrays {
    public static void main(String[] args) {
        //Task-> int arr[][]={
        //                {3,5},//0. kat
        //                {12,13,15},//1. kat
        //                {103,107,111,121},//2. kat
        //        };
        //        array elamanları toplamını print eden code create ediniz.

        int arr[][] = {
                {3, 5},//0. kat
                {12, 13, 15},//1. kat
                {103, 107, 111, 121},//2. kat
        };
        int toplam = 0; // bos kutu
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("array elemanlari toplami: " + toplam);
    }
}