package j11_Arrays.Homeworks;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String[] array = new String[] {"Apple","Orange","Banana","Pineapple"};
        boolean iscontain = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "Apple"){
                iscontain = true;
            }
        }
        System.out.println(iscontain);
    }
}