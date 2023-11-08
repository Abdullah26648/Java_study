package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Javatar_2 {
    /* Iki kisinin oynayacagi bir kelime oyunu app. create ediniz.
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          oyuncuların puanlarini ve kazanan oyuncuyu print ediniz.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paragraph = "";
        int player1Score = 0;
        int player2Score = 0;

        int currentPlayer = 1;

        do {
            String word = getPlayerInput(scanner, currentPlayer);
            System.out.println("Word: " + word);

            if (acceptWord(scanner)) {
                if (currentPlayer == 1) {
                    player1Score += word.length();
                } else {
                    player2Score += word.length();
                }
            } else {
                int winner = (currentPlayer == 1) ? 2 : 1;
                announceWinner(player1Score, player2Score, winner);
                break;
            }

            if (continuePlaying(scanner)) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
                paragraph = addToParagraph(scanner, paragraph, word);
                System.out.println("Paragraph: "+paragraph.replaceAll("  "," "));
            } else {
                break;
            }

        } while (true);

        endGame(player1Score, player2Score);
    }
    public static String getPlayerInput(Scanner scanner, int player) {
        System.out.print("Player " + player + ", enter a word: ");
        return scanner.next();
    }
    public static boolean acceptWord(Scanner scanner) {
        System.out.print("Do you accept the word? (yes/no): ");
        return scanner.next().equalsIgnoreCase("yes");
    }
    public static void announceWinner(int player1Score, int player2Score, int winner) {
        System.out.println("Invalid word! Player " + winner + " wins.");
        System.out.println("Player 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);
    }
    public static void endGame(int player1Score, int player2Score) {
        System.out.println("Game over.");
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins.");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins.");
        } else {
            System.out.println("It's a tie!");
        }
        System.out.println("Player 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);
    }
    public static boolean continuePlaying(Scanner scanner) {
        System.out.print("Do you want to continue playing? (yes/no): ");
        return scanner.next().equalsIgnoreCase("yes");
    }
    public static String addToParagraph(Scanner scanner, String paragraph, String word) {
        System.out.print("Add to the beginning or the end? (beginning/end): ");
        String position = scanner.next();
        if (position.equalsIgnoreCase("beginning")) {
            return word +" "+ paragraph;
        } else if (position.equalsIgnoreCase("end")) {
            return paragraph +" "+word;
        } else {
            System.out.println("Invalid position!");
            return paragraph;
        }
    }
}