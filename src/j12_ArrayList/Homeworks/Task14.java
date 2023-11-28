package j12_ArrayList.Homeworks;

import java.util.Scanner;

public class Task14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> str'nin karakter saysını print eden code create ediniz.
        System.out.print("Enter here: ");
        String str = scanner.nextLine();
        calculateChar(str);
    }
    private static void calculateChar(String str){
        int charCount = str.length();
        System.out.println("Number of characters: " + charCount);
    }
}