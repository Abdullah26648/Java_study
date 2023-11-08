package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to converter program ***");
        System.out.println("Enter 1 for kg to gr");
        System.out.println("Enter 2 for mile to km");
        System.out.println("Enter 3 for hour to second");
        System.out.print("Enter here: ");
        int converter = scanner.nextInt();
        double result = 0;
        switch (converter) {
            case 1:
                System.out.print("Please enter kg value: ");
                double kg = scanner.nextDouble();
                result = kgtogr(kg);
                System.out.println(kg + " kg equals " + result + " gr.");
                break;
            case 2:
                System.out.print("Please enter mile value: ");
                double mile = scanner.nextDouble();
                result = miletokm(mile);
                System.out.println(mile + " mile equals " + result + " km.");
                break;
            case 3:
                System.out.print("Please enter hour value: ");
                double hour = scanner.nextDouble();
                result = hourtosecond(hour);
                System.out.println(hour + " hour equals " + result + " second.");
                break;
        }
    }//main sonu
    private static double kgtogr(double kg) {
        double gr = kg * 1000;
        return gr;
    }
    private static double miletokm(double mile) {
        double km = mile * 1.609344;
        return km;
    }
    private static double hourtosecond(double hour) {
        double second = hour * 3600;
        return second;
    }
}// Class sonu