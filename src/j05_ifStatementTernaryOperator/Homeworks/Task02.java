package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Triangle height 1: ");
        int height1 = scanner.nextInt();
        System.out.print("Please enter your Triangle height 2: ");
        int height2 = scanner.nextInt();
        System.out.print("Please enter your Triangle height 3: ");
        int height3 = scanner.nextInt();

        if (height1 == height2 && height1 == height3) {
            System.out.println("Eşkenar üçgen");
        } else if (height1 == height2 || height1 == height3 || height2 == height3) {
            System.out.println("Ikizkenar üçgen");
        } else {
            System.out.println("Çeşitkenar üçgen");
        }
    }
}
