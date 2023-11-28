package j14_Varargs.Homeworks;

public class Task04 {
    public static void main(String[] args) {
        /* Task->
    stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
*/
        String strArr1[] = {"h", "a", "l", "u", "k"};
        String strArr2[] = {"a", "l", "i"};
        int sayi = 3;

        printFirstNChars(sayi, strArr1,strArr2);
    }

    private static void printFirstNChars(int sayi, String[]... string) {
        for (String [] str : string) {
            for (int i = 0; i < sayi; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        }
    }
}