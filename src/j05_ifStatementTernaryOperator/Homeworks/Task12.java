package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
        TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Karakter giriniz: ");
        char karakter = input.next().charAt(0);
        if (karakter >= 'a' && karakter <= 'z' || karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Girilen bir harf");
        } else {
            System.out.println("harf degil");
        }
    }
}