package j08_Loops.Homeworks2;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Isim ve soyisminizi girin: ");
		String isim = scanner.nextLine();
		String isim1 = isim.replace(" ", "");// Zaten var olan bosluklardan kurtuldum.
		int uzunluk = 0;// Sayacim.
		while (uzunluk < isim1.length()) {
			System.out.print(isim1.charAt(uzunluk)+" ");
			uzunluk++;
		}
	}
}