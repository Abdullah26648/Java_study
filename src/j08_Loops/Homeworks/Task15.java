package j08_Loops.Homeworks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		Scanner	scanner = new Scanner(System.in);
		System.out.print("Bir string giriniz: ");
		String str = scanner.nextLine();
		int sayac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sayac++;
			}
		}
		System.out.println("Girdiginiz stringde "+sayac+" adet rakam bulunmaktadir.");
	}
}