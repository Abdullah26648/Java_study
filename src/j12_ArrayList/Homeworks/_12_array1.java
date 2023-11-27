package j12_ArrayList.Homeworks;

public class _12_array1 {
    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
    */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};
        System.out.println(duplicate(array1));
        System.out.println(duplicate(array2));
    }
    private static boolean duplicate(int[] array) {
        boolean duplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }
}