package j11_Arrays.Homeworks;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";

        int sumOfDigits = calculateSumOfDigits(str);
        System.out.println("Sum of digits in the string: " + sumOfDigits);
    }
    public static int calculateSumOfDigits(String input) {
        char[] charArray = input.toCharArray();
        int sum = 0;

        for (char ch : charArray) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}