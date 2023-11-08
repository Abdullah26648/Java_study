package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task07 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
        System.out.println("Please enter three numbers:");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        double result = smallest(num1, num2, num3);

        System.out.println("The smallest number is: " + result);
    }//main sonu
    private static double smallest(double x, double y,double z) {
        if (x <= y && x <= z) {
            return x;
        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }
}//Class sonu