package j11_Arrays.Homeworks;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str = "Removes white space from both ends of a string";
        String[] array = str.split(" ");
        System.out.println(array.length);
    }
}