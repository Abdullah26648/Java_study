package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        Scanner input = new Scanner(System.in);
        System.out.print("Haftanin bir gununu giriniz: ");
        String hafta = input.next().toLowerCase();
        switch (hafta) {
            case "pazartesi","sali","carsamba","persembe","cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi","pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Geçersiz giris.");
        }
    }
}