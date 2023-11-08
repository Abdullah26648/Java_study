package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
        categorizeBMI(bmi);
    }//main sonu
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    private static void categorizeBMI(double bmi) {
        if (bmi <= 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi > 18.5 && bmi <= 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You have obesity.");
        }
    }
}
