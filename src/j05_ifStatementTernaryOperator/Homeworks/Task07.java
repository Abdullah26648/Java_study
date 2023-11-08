package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		Kullanıcıdan bir harf girmesini isteyin.
        Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
        “a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
        Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
        "Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		*/
        Scanner input = new Scanner(System.in);

        System.out.print("agam harf giriniz : ");
        Character harf = input.next().charAt(0);

        if (harf >= 'a' && harf <= 'z') {
            if ( harf.equals('a')) {
                System.out.println("Ilk küçük harf");
            }
            System.out.println("Ilk küçük harf degil");
        } else if (harf >= 'A' && harf <= 'Z') {
            if (harf.equals('Z')) {
                System.out.println("Son büyük harf");
            }
            System.out.println("Son büyük harf değil");
        } else {
            System.out.println("Harf girilmedi");
        }
    }
}

