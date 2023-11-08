package j04_AritmeticOperators.Homeworks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		/* Task->
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("3 basamakli bir tam sayi giriniz");
		int sayi = input.nextInt();
		if (sayi >= 100 && sayi <= 999) {
			int[] basamak = new int[3];
			basamak[0] = sayi % 10;
			basamak[1] = (sayi / 10) % 10;
			basamak[2] = (sayi / 100) % 10;
			int toplam = basamak[0] + basamak[2];
			System.out.println("Girdiginiz 3 basamakli sayinin ik ve ucuncu basamak toplami : " + toplam);
		} else {
			System.out.println("Lutfen 3 basamakli bir tam sayi giriniz !!!");
		}

	}
}