package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int number = scanner.nextInt();

        int tensDigit = (number / 10) % 10; // Onlar basamagini bulalim.

        String tensDigitInWords;

        switch (tensDigit) {
            case 0:
                tensDigitInWords = "Sıfır";
                break;
            case 1:
                tensDigitInWords = "Bir";
                break;
            case 2:
                tensDigitInWords = "İki";
                break;
            case 3:
                tensDigitInWords = "Üç";
                break;
            case 4:
                tensDigitInWords = "Dört";
                break;
            case 5:
                tensDigitInWords = "Beş";
                break;
            case 6:
                tensDigitInWords = "Altı";
                break;
            case 7:
                tensDigitInWords = "Yedi";
                break;
            case 8:
                tensDigitInWords = "Sekiz";
                break;
            case 9:
                tensDigitInWords = "Dokuz";
                break;
            default:
                tensDigitInWords = "Geçersiz";
        }
        System.out.println(tensDigitInWords);
    }
}