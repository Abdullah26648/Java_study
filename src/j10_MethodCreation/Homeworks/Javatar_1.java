package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Javatar_1 {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("*** Welcome to Javatar Airlines ***\nEnter the number of passengers: ");
        int numPassengers = scanner.nextInt();
        double totalCost = 0;

        for (int i = 1; i <= numPassengers; i++) {
            System.out.println("Passenger " + i);
            System.out.print("Enter age: ");
            int passengerAge = scanner.nextInt();

            System.out.println("Choose your destination city (B, C, D): ");
            String destinationCity = scanner.next().toUpperCase();
            int distance = 0;

            switch (destinationCity) {
                case "B":
                    distance = 500;
                    break;
                case "C":
                    distance = 700;
                    break;
                case "D":
                    distance = 900;
                    break;
                default:
                    System.out.println("Invalid destination city choice.");
                    return;
            }

            System.out.println("Is it a round trip (true/false)? ");
            boolean roundTrip = scanner.nextBoolean();

            double pricePerKm = 0.10;
            double passengerCost = calculateTicketPrice(distance, pricePerKm, passengerAge, roundTrip);
            totalCost += passengerCost;
        }

        System.out.println("Total ticket price for all passengers: $" + totalCost);
    }
    public static double calculateTicketPrice(double distance, double pricePerKm, int passengerAge, boolean roundTrip) {
        double totalPrice = distance * pricePerKm;

        if (passengerAge < 12) {
            totalPrice *= 0.5;
        } else if (passengerAge >= 12 && passengerAge <= 24) {
            totalPrice *= 0.9;
        } else if (passengerAge >= 65) {
            totalPrice *= 0.7;
        }

        if (roundTrip) {
            totalPrice *= 1.6;
        }
        return totalPrice;
    }
}