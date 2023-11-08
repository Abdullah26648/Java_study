package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task13 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*
        Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

        Örnekler:
        ("abc", "bc") ➞ true
        ("abc", "d") ➞ false
        ("samurai", "zi") ➞ false
        ("feminine", "nine") ➞ true
        ("convention", "tio") ➞ false
        */

        String x = "feminine";
        String y = "nine";
        String z = "tio";

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        boolean result = checkEndsWithAndEqualChars(str1, str2);

        if (result) {
            System.out.println("The second string ends with the last characters of the first string and they are equal.");
        } else {
            System.out.println("The conditions are not met.");
        }
    }//main sonu
    public static boolean checkEndsWithAndEqualChars(String first, String second) {
        if (second.length() > first.length()) {
            return false;
        }
        String sub = first.substring(first.length() - second.length());

        if (sub.equals(second)) {
            for (int i = 0; i < second.length(); i++) {
                if (first.charAt(first.length() - second.length() + i) != second.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}//Class sonu