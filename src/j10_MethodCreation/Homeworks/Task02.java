package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {// main level
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String fullname = scanner.nextLine();
        System.out.print("Your full name but arranged: "+ UpperCase(fullname));
    }//main sonu
    private static String UpperCase( String fullname) {
        String[] names = fullname.split(" ");
        String fullname2 = "";
        for (String name : names) {
            String arranged = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            fullname2 += arranged+" ";
        }
        return fullname2;
    }
}// Class sonu