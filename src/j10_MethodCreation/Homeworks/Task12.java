package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
        System.out.print("Enter an email address: ");
        String email = input.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }//main sonu
    public static boolean isValidEmail(String email) {
        if (!email.contains("@")) {
            return false;
        }
        if (email.indexOf("@") != email.lastIndexOf("@")) {
            return false;
        }
        if (email.indexOf("@") == 0) {
            return false;
        }
        if (!email.contains(".")) {
            return false;
        }
        return true;
    }
}//Class sonu