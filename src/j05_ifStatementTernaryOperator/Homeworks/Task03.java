package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your year: ");
        int year = scanner.nextInt();

        if (year > 1000) {
            System.out.println((year/1000)+" Milenyum");
        } else if (year > 100) {
            System.out.println((year/100)+" Yüzyıl");
        } else if (year > 10) {
            System.out.println((year/10)+" Onyıl");
        }
    }
}

	

