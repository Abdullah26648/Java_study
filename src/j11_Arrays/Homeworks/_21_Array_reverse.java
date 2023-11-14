package j11_Arrays.Homeworks;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        Integer number = 123;
        String str = number.toString();
        String[] array = str.split("");
        String reverse = "";
        for (int i = array.length-1; i >=0; i--){
            reverse += array[i];
        }
        System.out.println(reverse);
    }
}