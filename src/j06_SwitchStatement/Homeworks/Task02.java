package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
        //  hafta bitis:pazar alınız
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gün giriniz: ");
        String gun = scanner.next().toLowerCase();

        String Yuz_gun_sonra;

        switch (gun) {
            case "pazar":
                Yuz_gun_sonra = "Pazartesi";
                break;
            case "pazartesi":
                Yuz_gun_sonra = "Salı";
                break;
            case "sali":
                Yuz_gun_sonra = "Çarşamba";
                break;
            case "carsamba":
                Yuz_gun_sonra = "Perşembe";
                break;
            case "persembe":
                Yuz_gun_sonra = "Cuma";
                break;
            case "cuma":
                Yuz_gun_sonra = "Cumartesi";
                break;
            case "cumartesi":
                Yuz_gun_sonra = "Pazar";
                break;
            default:
                Yuz_gun_sonra = "Geçersiz";
        }
        System.out.println(Yuz_gun_sonra);
    }
}