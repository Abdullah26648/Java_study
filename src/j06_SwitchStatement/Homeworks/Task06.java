package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("VIP giriniz: ");
        String vip = scanner.next().toUpperCase();
        switch (vip) {
            case "VIP":
                System.out.println("VIP'in acilimi 'Very Important Person'");
                break;
            default:
                System.out.print("VIP giriniz !!!");
        }
    }
}