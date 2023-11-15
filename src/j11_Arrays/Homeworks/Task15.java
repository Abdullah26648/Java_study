package j11_Arrays.Homeworks;

public class Task15 {
    public static void main(String[] args) {
        //task-> aşağıdaki  arr  tum elemalarının çarpımını print eden code create edinz
        int arr[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };
        int total = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++){
                total *= arr[i][j];
            }
        }
        System.out.println(total);
    }
}