package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task->  Saati saniyeye çeviren  method create ediniz
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter hour value: ");
        double hour = scanner.nextDouble();
        double result = 0;
        result = hourtosecond(hour);
        System.out.println(hour + " hour equals " + result + " second.");

    }//main sonu
    private static double hourtosecond(double hour) {
        double second = hour * 3600;
        return second;
    }
}// Class sonu
