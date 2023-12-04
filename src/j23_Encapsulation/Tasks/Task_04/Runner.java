package j23_Encapsulation.Tasks.Task_04;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter tenant name: ");
        String name = scanner.nextLine();

        int roomCount;
        do {
            System.out.print("Enter number of rooms (0-3): ");
            roomCount = scanner.nextInt();

            if (roomCount < 0 || roomCount > 3) {
                System.out.println("Invalid number of rooms. Please enter a number between 0 and 3.");
            }
        } while (roomCount < 0 || roomCount > 3);

        System.out.print("Does the apartment have a balcony? (true/false): ");
        boolean balconyOrNo = scanner.nextBoolean();

        rentApartments tenant = new rentApartments(name, roomCount, balconyOrNo);

        int rent = tenant.calculateRent();

        System.out.println("Tenant: " + tenant.getName());
        System.out.println("Rent amount: $" + rent);
    }
}