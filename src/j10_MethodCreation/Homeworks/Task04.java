package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task04 {
    //amale köyden ırgat çağıran şeher
    /* *** Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
    ATM app. code create ediniz */
    static Scanner scanner = new Scanner(System.in);
    static int balance = 1000;

    public static void main(String[] args) {
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("*** Welcome to JavaBANK ***");
            System.out.println("1 for Check Balance");
            System.out.println("2 for Deposit Money");
            System.out.println("3 for Withdraw Money");
            System.out.println("4 for Exit");
            System.out.print("Enter your choice here: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    continueRunning = false;
                    System.out.println("Exiting... Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }//main sonu
    private static void checkBalance() {
        System.out.println("Your balance is: " + balance + " TL");
    }
    private static void depositMoney() {
        System.out.print("Enter the amount you want to deposit: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println(amount + " TL deposited. New balance: " + balance + " TL");
    }
    private static void withdrawMoney() {
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient balance. The transaction could not be completed.");
        } else {
            balance -= amount;
            System.out.println(amount + " TL withdrawn. New balance: " + balance + " TL");
        }
    }
}//Class sonu