package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);

        System.out.print("3 basamaklı bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int hundredsDigit = number / 100;
            int tensDigit = (number / 10) % 10;
            int onesDigit = number % 10;

            String hundredsInWords;
            String tensInWords;
            String onesInWords;

            switch (hundredsDigit) {
                case 1:
                    hundredsInWords = "Yüz";
                    break;
                case 2:
                    hundredsInWords = "İki Yüz";
                    break;
                case 3:
                    hundredsInWords = "Üç Yüz";
                    break;
                case 4:
                    hundredsInWords = "Dört Yüz";
                    break;
                case 5:
                    hundredsInWords = "Beş Yüz";
                    break;
                case 6:
                    hundredsInWords = "Altı Yüz";
                    break;
                case 7:
                    hundredsInWords = "Yedi Yüz";
                    break;
                case 8:
                    hundredsInWords = "Sekiz Yüz";
                    break;
                case 9:
                    hundredsInWords = "Dokuz Yüz";
                    break;
                default:
                    hundredsInWords = "";
            }

            switch (tensDigit) {
                case 2:
                    tensInWords = "Yirmi";
                    break;
                case 3:
                    tensInWords = "Otuz";
                    break;
                case 4:
                    tensInWords = "Kırk";
                    break;
                case 5:
                    tensInWords = "Elli";
                    break;
                case 6:
                    tensInWords = "Altmış";
                    break;
                case 7:
                    tensInWords = "Yetmiş";
                    break;
                case 8:
                    tensInWords = "Seksen";
                    break;
                case 9:
                    tensInWords = "Doksan";
                    break;
                default:
                    tensInWords = "";
            }

            switch (onesDigit) {
                case 1:
                    onesInWords = "Bir";
                    break;
                case 2:
                    onesInWords = "İki";
                    break;
                case 3:
                    onesInWords = "Üç";
                    break;
                case 4:
                    onesInWords = "Dört";
                    break;
                case 5:
                    onesInWords = "Beş";
                    break;
                case 6:
                    onesInWords = "Altı";
                    break;
                case 7:
                    onesInWords = "Yedi";
                    break;
                case 8:
                    onesInWords = "Sekiz";
                    break;
                case 9:
                    onesInWords = "Dokuz";
                    break;
                default:
                    onesInWords = "";
            }
            System.out.println("Girilen sayının yazılışı: " + hundredsInWords + " " + tensInWords + " " + onesInWords);
        } else {
            System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
        }
    }
}
