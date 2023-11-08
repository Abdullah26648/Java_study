package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		/* Task->
		Kullanıcıdan password girmesini isteyin.
		Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
		Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		*/

		Scanner input = new Scanner(System.in);
		System.out.print("Şifre giriniz (Sadece rakam): ");
		String password = input.next();

		// Converted the password to an integer
		int passwordInt = Integer.parseInt(password);

		if (passwordInt % 5 == 0) {
			// Getting the last digit of the password as a character
			char lastDigitChar = password.charAt(password.length() - 1);
			if (lastDigitChar == '0') {
				System.out.println("5’e bölünen çift sayı");
			} else {
				System.out.println("5’e bölünen tek sayı");
			}
		} else {
			System.out.println("Tekrar deneyin");
		}
	}
}
