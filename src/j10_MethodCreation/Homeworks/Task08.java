package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        /*
        Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

        input: 2023
        output:false
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();
        boolean result = isLeapYear(year);

        if (result) {
            System.out.println("Leap year: true");
        } else {
            System.out.println("Leap year: false");
        }
    }//main sonu
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}//Class sonu
