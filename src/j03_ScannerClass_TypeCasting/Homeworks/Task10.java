package j03_ScannerClass_TypeCasting.Homeworks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        Task->
        Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        formula :  c = (f-32)*5/9
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava sicakligini (f) giriniz: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("Hava sicakligi : " + celsius + " Celsius");
    }


}
