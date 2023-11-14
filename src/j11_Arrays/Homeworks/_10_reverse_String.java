package j11_Arrays.Homeworks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
        Trick-> String split ile arraya atanmalı
         */
        String str = "Hello World";
        String[] array = str.split("");
        String reverse = "";
        for (int i = array.length-1; i >= 0 ; i--) {
            reverse += array[i];
        }
        System.out.println(reverse);
    }
}