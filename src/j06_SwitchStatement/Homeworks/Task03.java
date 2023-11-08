package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hafta günü numarası giriniz (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Pazartesi";
                break;
            case 2:
                dayName = "Salı";
                break;
            case 3:
                dayName = "Çarşamba";
                break;
            case 4:
                dayName = "Perşembe";
                break;
            case 5:
                dayName = "Cuma";
                break;
            case 6:
                dayName = "Cumartesi";
                break;
            case 7:
                dayName = "Pazar";
                break;
            default:
                dayName = "Geçersiz";
        }
        System.out.println(dayName);
    }
}