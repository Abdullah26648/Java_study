package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;
import java.util.Random;

public class Task17 {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
        */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Tas", "Kagit", "Makas"};

        System.out.println("Tas, Kagit, Makas oyununa hosgeldiniz!");

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.print("Sizce hangisi? (Tas, Kagit, or Makas): ");
        String userChoice = scanner.nextLine();

        // Kullanicin girdigi degerleri kontrol ediyoruz
        if (!userChoice.equalsIgnoreCase("Tas") &&
                !userChoice.equalsIgnoreCase("Kagit") &&
                !userChoice.equalsIgnoreCase("Makas")) {
            System.out.println("Gecersiz giris. Lutfen Tas, Kagit yada Makas giriniz");
        } else {
            System.out.println("Bilgisayarin tahmini: " + computerChoice);

            // Kimin kazandigini belirliyoruz
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("Berabere !");
            } else if ((userChoice.equalsIgnoreCase("Tas") && computerChoice.equalsIgnoreCase("Makas")) ||
                    (userChoice.equalsIgnoreCase("Kagit") && computerChoice.equalsIgnoreCase("Tas")) ||
                    (userChoice.equalsIgnoreCase("Makas") && computerChoice.equalsIgnoreCase("Kagit"))) {
                System.out.println("Tebrikler sen kazandin !");
            } else {
                System.out.println("Uzgunum kaybettin !");
            }
        }
    }
}
