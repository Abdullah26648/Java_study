package j11_Arrays.Homeworks;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2";
        str = str.replaceAll("\\$", "");

        int total = 0;
        String[] array = str.split(" ");

        for (String s : array) {
            total += Integer.parseInt(s);
        }

        System.out.println("Total: " + total);
    }
}