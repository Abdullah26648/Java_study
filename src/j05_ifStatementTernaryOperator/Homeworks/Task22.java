package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task22 {
        public static void main(String[] args) {
                /*
                Sifreyi kontrol etmek için ternary yaziniz.
                8'den fazla karakter iceriyorsa, baş harfi 'i' olmalidir.
                8 karakterden fazla icermiyorsa, baş harfi 'K' olmalidir.
                */
                Scanner scanner = new Scanner(System.in);

                System.out.print("Şifreyi girin: ");
                String password = scanner.nextLine();

                String result = (password.length() > 8) ? (password.charAt(0) == 'i' ? "Geçerli şifre" : "Baş harfi 'i' olmalıdır.")
                        : (password.charAt(0) == 'K' ? "Geçerli şifre" : "Baş harfi 'K' olmalıdır.");

                System.out.println(result);


        }
}