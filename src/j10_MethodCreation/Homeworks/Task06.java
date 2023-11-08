package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz
        System.out.println("Please select a geometric shape");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Enter here: ");
        int shapeChoice = input.nextInt();

        double dimension1, dimension2;

        if (shapeChoice == 1 || shapeChoice == 2) { // No need for a second dimension for a square
            System.out.println("Enter the first dimension:");
            dimension1 = input.nextDouble();
            System.out.println("Enter the second dimension:");
            dimension2 = input.nextDouble();
        } else if (shapeChoice == 3) {
            System.out.println("Enter the side length:");
            dimension1 = input.nextDouble();
            dimension2 = 0; // No need for a second dimension for a square
        } else {
            System.out.println("Invalid shape choice.");
            return;
        }

        switch (shapeChoice) {
            case 1:
                calculateTriangleAreaAndPerimeter(dimension1, dimension2);
                break;
            case 2:
                calculateRectangleAreaAndPerimeter(dimension1, dimension2);
                break;
            case 3:
                calculateSquareAreaAndPerimeter(dimension1);
                break;
            default:
                System.out.println("Invalid shape choice.");
        }
    }//main sonu
    private static void calculateTriangleAreaAndPerimeter(double base, double height) {
        double area = 0.5 * base * height;
        double perimeter = base + (2 * Math.sqrt((base * base / 4) + (height * height)));
        System.out.println("Triangle Area: " + area);
        System.out.println("Triangle Perimeter: " + perimeter);
    }

    private static void calculateRectangleAreaAndPerimeter(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    private static void calculateSquareAreaAndPerimeter(double side) {
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }
}//Class sonu