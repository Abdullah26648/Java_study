package j14_Varargs.Homeworks;

public class Task03 {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        String str2 = "perfect javacı Abdulhamit";//
        String str3 = "beleştepe muhtarı CEREN";//

        calculateLength(sayi1, str1, str2, str3);
    }

    private static void calculateLength(int multiplier, String... strings) {
        int maxLength = 0;

        for (String str : strings) {
            String[] words = str.split("\\s+");
            for (String word : words) {
                maxLength = Math.max(maxLength, word.length());
            }
        }

        int result = maxLength * multiplier;

        System.out.println("Result: " + result);
    }
}
