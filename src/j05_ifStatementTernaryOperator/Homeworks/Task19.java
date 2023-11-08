package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task19 {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dogum yilini girermisin: ");
        int birthYear = scanner.nextInt();

        // Cin burcu hesaplanirken dogum tarihinin 12'ye bolumunden kalana bakilir
        int zodiacIndex = birthYear % 12;

        String[] zodiacSigns = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };

        String zodiacSign = zodiacSigns[zodiacIndex];

        System.out.println("Cin burcun: " + zodiacSign);
    }
}
