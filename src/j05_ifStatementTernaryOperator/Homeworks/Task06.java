package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("agam cinsiyetini giresen : ");
		String cnsyt= input.next();

		System.out.print("agam yasını giresen : ");
		int agaYası = input.nextInt();

		if (agaYası >= 18) {
			if (cnsyt.equals("Erkek")) {
                System.out.println("Adam");
            } else {
                System.out.println("Kadin");
            }
		}else {
			if (cnsyt.equals("Erkek")) {
                System.out.println("Erkek çocuk");
            } else {
                System.out.println("Kiz çocuk");
            }
		}
	}
}